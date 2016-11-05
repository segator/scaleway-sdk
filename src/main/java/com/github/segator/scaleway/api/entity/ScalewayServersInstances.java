/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity;

import java.util.List;

/**
 *
 * @author isaac_000
 */
public class ScalewayServersInstances {

    private List<ScalewayServer> servers;

    public List<ScalewayServer> getServers() {
        return servers;
    }

    public void setServers(List<ScalewayServer> servers) {
        this.servers = servers;
    }

}
