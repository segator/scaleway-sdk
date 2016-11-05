/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author isaac_000
 */
public class ScalewayUserKeyDefinitionResponse {

    @JsonProperty("ssh_public_keys")
    private List<ScalewayUserKeyDefinition> sshPublicKeys;

    public List<ScalewayUserKeyDefinition> getSshPublicKeys() {
        return sshPublicKeys;
    }

    public void setSshPublicKeys(List<ScalewayUserKeyDefinition> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
    }

}
