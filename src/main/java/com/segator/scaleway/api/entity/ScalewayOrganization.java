/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/**
 *
 * @author isaac_000
 */
public class ScalewayOrganization {

    private String id;
    private String name;
    @JsonProperty("address_line1")
    private String addressLine;
    @JsonProperty("address_line2")
    private String addressLine2;
    @JsonProperty("address_country_code")
    private String addressCountryCode;
    @JsonProperty("support_level")
    private String supportLevel;
    @JsonProperty("modification_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date modificationDate;
    private String currency;
    private String locale;
    @JsonProperty("customer_class")
    private String customerClass;
    @JsonProperty("support_id")
    private String supportId;
    @JsonProperty("creation_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSX")
    private Date creationDate;
    @JsonProperty("address_postal_code")
    private String addressPortalCode;
    @JsonProperty("address_city_name")
    private String addressCityName;
    @JsonProperty("address_subdivision_code")
    private String addressSubdivisionCode;
    private String timezone;
    @JsonProperty("vat_number")
    private String vatNumber;
    @JsonProperty("support_pin")
    private String supportPin;
    private List<ScalewayAccountWarnings> warnings;

    private List<ScalewayUser> users;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScalewayUser> getUsers() {
        return users;
    }

    public void setUsers(List<ScalewayUser> users) {
        this.users = users;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getAddressCountryCode() {
        return addressCountryCode;
    }

    public void setAddressCountryCode(String addressCountryCode) {
        this.addressCountryCode = addressCountryCode;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getSupportLevel() {
        return supportLevel;
    }

    public void setSupportLevel(String supportLevel) {
        this.supportLevel = supportLevel;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAddressPortalCode() {
        return addressPortalCode;
    }

    public void setAddressPortalCode(String addressPortalCode) {
        this.addressPortalCode = addressPortalCode;
    }

    public String getAddressCityName() {
        return addressCityName;
    }

    public void setAddressCityName(String addressCityName) {
        this.addressCityName = addressCityName;
    }

    public String getAddressSubdivisionCode() {
        return addressSubdivisionCode;
    }

    public void setAddressSubdivisionCode(String addressSubdivisionCode) {
        this.addressSubdivisionCode = addressSubdivisionCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getSupportId() {
        return supportId;
    }

    public void setSupportId(String supportId) {
        this.supportId = supportId;
    }

    public String getSupportPin() {
        return supportPin;
    }

    public void setSupportPin(String supportPin) {
        this.supportPin = supportPin;
    }

    public List<ScalewayAccountWarnings> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<ScalewayAccountWarnings> warnings) {
        this.warnings = warnings;
    }

}
