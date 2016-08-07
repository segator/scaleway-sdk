/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author isaac_000
 */
public class ScalewayServer extends ScalewayServerTemplate {

    private BootScript bootscript;
    @JsonProperty("dynamic_ip_required")
    private boolean dynamicIpRequired;
    private String id;

    @JsonProperty("public_ip")
    private ScalewayIP publicIp;
    @JsonProperty("private_ip")
    private String privateIp;

    @JsonProperty("extra_networks")
    private String[] extraNetworks;
    private ScalewayState state;
    private String arch;
    @JsonProperty("state_detail")
    public String stateDetail;
    @JsonProperty("modification_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date modificationDate;

    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date creationDate;
    private ScalewayLocation location;
    private String ipv6;
    @JsonProperty("enable_ipv6")
    private boolean ipv6Enabled;
    @JsonProperty("commercial_type")
    private ScalewayCommercialType commercialType;
    @JsonProperty("security_group")
    private ScalewaySecurityGroup securityGroup;
    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public BootScript getBootscript() {
        return bootscript;
    }

    public void setBootscript(BootScript bootscript) {
        this.bootscript = bootscript;
    }

    public boolean isDynamicIpRequired() {
        return dynamicIpRequired;
    }

    public void setDynamicIpRequired(boolean dynamicIpRequired) {
        this.dynamicIpRequired = dynamicIpRequired;
    }

    public boolean isIpv6Enabled() {
        return ipv6Enabled;
    }

    public void setIpv6Enabled(boolean ipv6Enabled) {
        this.ipv6Enabled = ipv6Enabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public ScalewayIP getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(ScalewayIP publicIp) {
        this.publicIp = publicIp;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ScalewayState getState() {
        return state;
    }

    public void setState(ScalewayState state) {
        this.state = state;
    }

    public String getStateDetail() {
        return stateDetail;
    }

    public void setStateDetail(String stateDetail) {
        this.stateDetail = stateDetail;
    }

    public ScalewayLocation getLocation() {
        return location;
    }

    public void setLocation(ScalewayLocation location) {
        this.location = location;
    }

    public String getIpv6() {
        return ipv6;
    }

    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    public ScalewayCommercialType getCommercialType() {
        return commercialType;
    }

    public void setCommercialType(ScalewayCommercialType commercialType) {
        this.commercialType = commercialType;
    }

    public ScalewaySecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(ScalewaySecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String[] getExtraNetworks() {
        return extraNetworks;
    }

    public void setExtraNetworks(String[] extraNetworks) {
        this.extraNetworks = extraNetworks;
    }

}
