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
public class ScalewayServer extends ScalewayServerTemplate {

    private String id;

    @JsonProperty("private_ip")
    private String privateIp;

    @JsonProperty("extra_networks")
    private String[] extraNetworks;
    @JsonProperty("state")
    private ScalewayServerState state;
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
    @JsonProperty("ipv6")
    private ScalewayIPv6 ipv6;
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

    public ScalewayIPv6 getIpv6() {
        return ipv6;
    }

    public void setIpv6(ScalewayIPv6 ipv6) {
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

    public ScalewayServerState getState() {
        return state;
    }

    public void setState(ScalewayServerState state) {
        this.state = state;
    }
}
