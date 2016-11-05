/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api;


/**
 *
 * @author isaac_000
 */
public class ScalewayFactory {

    public static ScalewayClient getScalewayClient(String accessToken, String organizationToken) {
        return new ScalewayClient(accessToken, organizationToken);
    }   
}
