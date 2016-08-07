/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity;

import java.util.List;

/**
 *
 * @author isaac_000
 */
public class ScalewayOrganizationsInstances {

    private List<ScalewayOrganization> organizations;

    public List<ScalewayOrganization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<ScalewayOrganization> organizations) {
        this.organizations = organizations;
    }

}
