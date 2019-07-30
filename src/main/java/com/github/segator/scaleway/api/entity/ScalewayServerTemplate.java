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

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
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
    @JsonProperty("allowed_actions")
    private List<ScalewayServerAction> allowedActions;
    @JsonProperty("maintenances")
    private List<Date> maintenances;
    @JsonProperty("boot_type")
    private String bootType;
    @JsonProperty("compute_cluster")
    private ScalewayComputeCluster computeCluster;
    @JsonProperty("protected")
    private boolean _protected;

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

    public List<ScalewayServerAction> getAllowedActions() {
        return allowedActions;
    }

    public void setAllowedActions(List<ScalewayServerAction> allowedActions) {
        this.allowedActions = allowedActions;
    }

    public List<Date> getMaintenances() {
        return maintenances;
    }

    public void setMaintenances(List<Date> maintenances) {
        this.maintenances = maintenances;
    }

    public String getBootType() {
        return bootType;
    }

    public void setBootType(String bootType) {
        this.bootType = bootType;
    }

    public ScalewayComputeCluster getComputeCluster() {
        return computeCluster;
    }

    public void setComputeCluster(ScalewayComputeCluster computeCluster) {
        this.computeCluster = computeCluster;
    }

    public boolean is_protected() {
        return _protected;
    }

    public void set_protected(boolean _protected) {
        this._protected = _protected;
    }
}
