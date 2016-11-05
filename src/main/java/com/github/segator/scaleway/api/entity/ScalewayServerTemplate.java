/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 *
 * @author isaac_000
 */

public class ScalewayServerTemplate {

    public String name;
    public String organization;    
    public Map<String, ScalewayVolume> volumes;
    public List<String> tags;
    @JsonProperty("commercial_type")
    private ScalewayCommercialType commercialType;
    @JsonProperty("dynamic_ip_required")
    private boolean dynamicIpRequired;
    @JsonProperty("enable_ipv6")
    private boolean ipv6Enabled;
    @JsonProperty("public_ip")
    private ScalewayIP publicIp;
    @JsonProperty("security_group")
    private ScalewaySecurityGroup securityGroup;
    private BootScript bootscript;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public BootScript getBootscript() {
        return bootscript;
    }

    public void setBootscript(BootScript bootscript) {
        this.bootscript = bootscript;
    }

    public ScalewaySecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(ScalewaySecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    public ScalewayCommercialType getCommercialType() {
        return commercialType;
    }
    

    public void setCommercialType(ScalewayCommercialType commercialType) {
        this.commercialType = commercialType;
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

    public ScalewayIP getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(ScalewayIP publicIp) {
        this.publicIp = publicIp;
    }

    public Map<String, ScalewayVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(Map<String, ScalewayVolume> volumes) {
        this.volumes = volumes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

}
