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
package com.github.segator.scaleway.api.entity.exceptions;

import com.github.segator.scaleway.api.Utils;
import com.github.segator.scaleway.api.entity.ScalewayResponseError;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
 */
public class ScalewayInvalidRequestException extends ScalewayException {

    private final StatusLine statusLine;
    private ScalewayResponseError scalewayResponseError;

    public ScalewayInvalidRequestException(HttpResponse response) {
        this.statusLine = response.getStatusLine();
        try {
            this.scalewayResponseError = Utils.parseJson(response.getEntity(), ScalewayResponseError.class);
        } catch (IOException ex) {
            this.scalewayResponseError = new ScalewayResponseError();
            scalewayResponseError.setMessage(ex.getMessage());
            scalewayResponseError.setType("error response, parse error");
        }

    }

    public StatusLine getStatusLine() {
        return statusLine;
    }

    public ScalewayResponseError getScalewayResponseError() {
        return scalewayResponseError;
    }

    @Override
    public String toString() {
        return "Invalid Request:" + scalewayResponseError.toString();
    }

}
