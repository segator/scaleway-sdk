/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity;

/**
 *
 * @author isaac_000
 */
public class ScalewayRole {

    private ScalewayOrganization organization;
    private String role;

    public ScalewayOrganization getOrganization() {
        return organization;
    }

    public void setOrganization(ScalewayOrganization organization) {
        this.organization = organization;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
