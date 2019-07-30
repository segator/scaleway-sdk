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
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
 */
public class ScalewayServerTask {

    private String description;
    @JsonProperty("href_from")
    private String hrefFrom;
    @JsonProperty("href_result")
    private String hrefResult;
    private String id;
    private String progress;
    private ScalewayServerTaskStatus status;
    @JsonProperty("terminated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date terminatedAt;
    @JsonProperty("started_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date startedAt;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHrefFrom() {
        return hrefFrom;
    }

    public void setHrefFrom(String hrefFrom) {
        this.hrefFrom = hrefFrom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public ScalewayServerTaskStatus getStatus() {
        return status;
    }

    public void setStatus(ScalewayServerTaskStatus status) {
        this.status = status;
    }

    public Date getTerminatedAt() {
        return terminatedAt;
    }

    public void setTerminatedAt(Date terminatedAt) {
        this.terminatedAt = terminatedAt;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public String getHrefResult() {
        return hrefResult;
    }

    public void setHrefResult(String hrefResult) {
        this.hrefResult = hrefResult;
    }
}
