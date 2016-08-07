/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segator.scaleway.api.entity.exceptions;

import java.io.IOException;

/**
 *
 * @author isaac_000
 */
public class ScalewayException extends Exception {

    private Exception parentException;

    public ScalewayException(Exception ex) {
        this.parentException = ex;
    }

    public ScalewayException() {

    }

    public Exception getParentException() {
        return parentException;
    }

}
