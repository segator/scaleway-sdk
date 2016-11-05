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
public enum ScalewayCommercialType {
    @JsonProperty("VC1S")
    VC1S,
    @JsonProperty("VC1M")
    VC1M,
    @JsonProperty("VC1L")
    VC1L,
    @JsonProperty("C2S")
    C2S,
    @JsonProperty("C2M")
    C2M,
    @JsonProperty("C2L")
    C2L;
}
