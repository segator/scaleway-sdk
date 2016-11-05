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
public enum ScalewayServerAction {
    @JsonProperty("poweron")
    POWER_ON,
    @JsonProperty("poweroff")
    POWER_OFF,
    @JsonProperty("reboot")
    REBOOT,
    @JsonProperty("terminate")
    TERMINATE;
}
