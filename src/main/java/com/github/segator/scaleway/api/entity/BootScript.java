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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
 */
public class BootScript {

    private String id;

    private String organization;

    private String title;

    private String bootcmdargs;

    private String initrd;

    private String architecture;

    private String kernel;

    private String dtb;
    @JsonProperty("default")
    private boolean boolDefault;
    
    @JsonProperty("public")
    private boolean boolPublic;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBoolDefault() {
        return boolDefault;
    }

    public void setBoolDefault(boolean boolDefault) {
        this.boolDefault = boolDefault;
    }

    public boolean isBoolPublic() {
        return boolPublic;
    }

    public void setBoolPublic(boolean boolPublic) {
        this.boolPublic = boolPublic;
    }

  

    public String getBootcmdargs() {
        return bootcmdargs;
    }

    public void setBootcmdargs(String bootcmdargs) {
        this.bootcmdargs = bootcmdargs;
    }

    public String getInitrd() {
        return initrd;
    }

    public void setInitrd(String initrd) {
        this.initrd = initrd;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getKernel() {
        return kernel;
    }

    public void setKernel(String kernel) {
        this.kernel = kernel;
    }

    public String getDtb() {
        return dtb;
    }

    public void setDtb(String dtb) {
        this.dtb = dtb;
    }

}
