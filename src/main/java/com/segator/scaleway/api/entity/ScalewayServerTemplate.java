/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity;

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
    public ScalewayImage image;
    public Map<String, ScalewayVolume> volumes;
    public List<String> tags;

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

    public ScalewayImage getImage() {
        return image;
    }

    public void setImage(ScalewayImage image) {
        this.image = image;
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
