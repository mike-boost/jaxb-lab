/*
 * Country.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb.domain;

import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlValue;

public class Country {

    @XmlValue
    private String code;

    @XmlTransient
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
