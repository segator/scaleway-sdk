/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author isaac_000
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
