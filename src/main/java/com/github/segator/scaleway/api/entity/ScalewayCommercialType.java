/*
 * The MIT License
 *
 * Copyright 2016 Isaac Aymerich <isaac.aymerich@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.segator.scaleway.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 * @author Isaac Aymerich <isaac.aymerich@gmail.com>
 */
public enum ScalewayCommercialType {
    @JsonProperty("ARM64-128GB")
    ARM64_128GB("arm64", false),
    @JsonProperty("ARM64-64GB")
    ARM64_64GB("arm64", false),
    @JsonProperty("ARM64-32GB")
    ARM64_32GB("arm64", false),
    @JsonProperty("ARM64-16GB")
    ARM64_16GB("arm64", false),
    @JsonProperty("ARM64-8GB")
    ARM64_8GB("arm64", false),
    @JsonProperty("ARM64-4GB")
    ARM64_4GB("arm64", false),
    @JsonProperty("ARM64-2GB")
    ARM64_2GB("arm64", false),
    @JsonProperty("VC1S")
    VC1S("x86_64", false),
    @JsonProperty("VC1M")
    VC1M("x86_64", false),
    @JsonProperty("VC1L")
    VC1L("x86_64", false),
    @JsonProperty("C1")
    C1("arm", true),
    @JsonProperty("C2S")
    C2S("x86_64", true),
    @JsonProperty("C2M")
    C2M("x86_64", true),
    @JsonProperty("C2L")
    C2L("x86_64", true),
    @JsonProperty("DEV1-XS")
    DEV1_XS("x86_64", true),
    @JsonProperty("DEV1-S")
    DEV1_S("x86_64", true),
    @JsonProperty("DEV1-M")
    DEV1_M("x86_64", true),
    @JsonProperty("DEV1-L")
    DEV1_L("x86_64", true),
    @JsonProperty("DEV1-XL")
    DEV1_XL("x86_64", true),
    @JsonProperty("GP1-XS")
    GP1_XS("x86_64", true),
    @JsonProperty("GP1-S")
    GP1_S("x86_64", true),
    @JsonProperty("GP1-M")
    GP1_M("x86_64", true),
    @JsonProperty("GP1-L")
    GP1_L("x86_64", true),
    @JsonProperty("GP1-XL")
    GP1_XL("x86_64", true),
    @JsonProperty("X64-120GB")
    X64_120GB("x86_64", true),
    @JsonProperty("X64-60GB")
    X64_60GB("x86_64", true),
    @JsonProperty("X64-30GB")
    X64_30GB("x86_64", true),
    @JsonProperty("X64-15GB")
    X64_15GB("x86_64", true);

    private String arch = "";
    private boolean baremetal = false;

    ScalewayCommercialType(String arch, boolean baremetal) {
        this.arch = arch;
        this.baremetal = baremetal;
    }

    public String getArch() {
        return arch;
    }

    public boolean isBaremetal() {
        return baremetal;
    }
}
