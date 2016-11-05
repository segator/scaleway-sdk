/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;

/**
 *
 * @author isaac_000
 */
@JsonSerialize
public class ScalewayVolume {

    private String id;

    private String name;
    
 
    @JsonProperty("volume_type")
    private ScalewayVolumeType volumeType;

    private String size;
    private String organization;
    @JsonProperty("export_uri")
    private String exportUri;
    @JsonProperty("modification_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date modificationDate;

    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date creationDate;
    
    private ScalewayServer server;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScalewayServer getServer() {
        return server;
    }

    public void setServer(ScalewayServer server) {
        this.server = server;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScalewayVolumeType getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(ScalewayVolumeType volumeType) {
        this.volumeType = volumeType;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getExportUri() {
        return exportUri;
    }

    public void setExportUri(String exportUri) {
        this.exportUri = exportUri;
    }

}
