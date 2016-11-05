/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.segator.scaleway.api.entity.exceptions;

import com.github.segator.scaleway.api.Utils;
import com.github.segator.scaleway.api.entity.ScalewayResponseError;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

/**
 *
 * @author isaac_000
 */
public class ScalewayInvalidRequestException extends ScalewayException {

    private final StatusLine statusLine;
    private ScalewayResponseError scalewayResponseError;

    public ScalewayInvalidRequestException(HttpResponse response) {
        this.statusLine = response.getStatusLine();
        try {
            this.scalewayResponseError = Utils.parseJson(response.getEntity(), ScalewayResponseError.class);
        } catch (IOException ex) {
            this.scalewayResponseError = new ScalewayResponseError();
            scalewayResponseError.setMessage(ex.getMessage());
            scalewayResponseError.setType("error response, parse error");
        }

    }

    public StatusLine getStatusLine() {
        return statusLine;
    }

    public ScalewayResponseError getScalewayResponseError() {
        return scalewayResponseError;
    }

    @Override
    public String toString() {
        return "Invalid Request:" + scalewayResponseError.toString();
    }

}
