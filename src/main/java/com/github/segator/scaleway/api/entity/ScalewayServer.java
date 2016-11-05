/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author isaac_000
 */
public class ScalewayServer extends ScalewayServerTemplate {

    private String id;

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
    public ScalewayImage image;

    private String hostname;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScalewayImage getImage() {
        return image;
    }

    public void setImage(ScalewayImage image) {
        this.image = image;
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
