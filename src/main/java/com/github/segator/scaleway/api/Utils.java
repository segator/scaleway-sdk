/*
 * The MIT License
 *
 * Copyright 2016 Isaac Aymerich <isaac.aymerich@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.segator.scaleway.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.segator.scaleway.api.constants.ScalewayConstants;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;

/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
 */
public class Utils {

    public static HttpRequestBase buildRequest(String type, String typeUrl, String method, String accessToken) {
        String requestPath = new StringBuilder(typeUrl).append("/").append(method).toString();
        return buildRequest(type, requestPath, accessToken);
    }

    public static HttpRequestBase buildRequest(String type, String requestPath, String accessToken) {
        HttpRequestBase request = null;
        switch (type) {
            case "POST":
                request = new HttpPost(requestPath);
                break;
            case "GET":
                request = new HttpGet(requestPath);
                break;
            case "DELETE":
                request = new HttpDelete(requestPath);
                break;
            case "PATCH":
                request = new HttpPatch(requestPath);
                break;
        }
        request.setHeader(ScalewayConstants.HEADER_AUTH_TOKEN, accessToken);
        request.setHeader(HttpHeaders.CONTENT_TYPE, ScalewayConstants.JSON_APPLICATION);
        return request;
    }

    public static ObjectMapper initializeObjectMapperJson() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.enable(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        return mapper;
    }

    public static <T> T parseJson(HttpEntity responseEntity, Class<T> type) throws IOException {

        String encoding = responseEntity.getContentEncoding() != null ? responseEntity.getContentEncoding().getValue() : "UTF-8";
        String jsonString = IOUtils.toString(responseEntity.getContent(), encoding);
        try {
            return initializeObjectMapperJson().readValue(jsonString, type);
        } catch (Exception ex) {
            System.out.println(jsonString);
            throw ex;
        }
    }

    public static String formatJson(Object entity) throws JsonProcessingException {
        return initializeObjectMapperJson().writeValueAsString(entity);
    }
}
