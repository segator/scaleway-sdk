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
public class ScalewayServerActionsResponse {

    private List<ScalewayServerAction> actions;

    public List<ScalewayServerAction> getActions() {
        return actions;
    }

    public void setActions(List<ScalewayServerAction> actions) {
        this.actions = actions;
    }

  

}
