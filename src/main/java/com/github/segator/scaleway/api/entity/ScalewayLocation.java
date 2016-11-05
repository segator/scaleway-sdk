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
public class ScalewayLocation {

    @JsonProperty("platform_id")
    private String platformID;
    @JsonProperty("hypervisor_id")
    private String hypervisorID;
    @JsonProperty("node_id")
    private String nodeID;
    @JsonProperty("cluster_id")
    private String clusterID;
    @JsonProperty("chassis_id")
    private String chassisId;

    public String getPlatformID() {
        return platformID;
    }

    public void setPlatformID(String platformID) {
        this.platformID = platformID;
    }

    public String getHypervisorID() {
        return hypervisorID;
    }

    public void setHypervisorID(String hypervisorID) {
        this.hypervisorID = hypervisorID;
    }

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public String getChassisId() {
        return chassisId;
    }

    public void setChassisId(String chassisId) {
        this.chassisId = chassisId;
    }
}
