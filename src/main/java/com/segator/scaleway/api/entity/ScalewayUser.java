/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.Date;
import java.util.List;

/**
 *
 * @author isaac_000
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ScalewayUser {

    private String id;
    private String email;
    private String firstname;
    private String fullname;
    private String lastname;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date creationDate;
     @JsonProperty("modification_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date modificationDate;
    private List<ScalewayOrganization> organizations;
    private List<ScalewayRole> roles;
    @JsonProperty("ssh_public_keys")
    private List<ScalewayUserKey> sshPublicKeys;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<ScalewayOrganization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<ScalewayOrganization> organizations) {
        this.organizations = organizations;
    }

    public List<ScalewayRole> getRoles() {
        return roles;
    }

    public void setRoles(List<ScalewayRole> roles) {
        this.roles = roles;
    }

    public List<ScalewayUserKey> getSshPublicKeys() {
        return sshPublicKeys;
    }

    public void setSshPublicKeys(List<ScalewayUserKey> sshPublicKeys) {
        this.sshPublicKeys = sshPublicKeys;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
    

}
