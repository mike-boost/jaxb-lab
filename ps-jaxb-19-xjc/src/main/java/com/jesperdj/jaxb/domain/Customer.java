/*
 * Customer.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.22 at 05:23:30 PM CEST 
//


package com.jesperdj.jaxb.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shippingAddress" type="{http://www.jesperdj.com/ps-jaxb}address"/>
 *         &lt;element name="billingAddress" type="{http://www.jesperdj.com/ps-jaxb}address"/>
 *         &lt;element name="loyalty" type="{http://www.jesperdj.com/ps-jaxb}loyalty"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
        "name",
        "shippingAddress",
        "billingAddress",
        "loyalty"
})
public class Customer {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Address shippingAddress;
    @XmlElement(required = true)
    protected Address billingAddress;
    @XmlElement(required = true, defaultValue = "BRONZE")
    @XmlSchemaType(name = "string")
    protected Loyalty loyalty;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shippingAddress property.
     *
     * @return possible object is
     * {@link Address }
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     *
     * @param value allowed object is
     *              {@link Address }
     */
    public void setShippingAddress(Address value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     *
     * @return possible object is
     * {@link Address }
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     *
     * @param value allowed object is
     *              {@link Address }
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the loyalty property.
     *
     * @return possible object is
     * {@link Loyalty }
     */
    public Loyalty getLoyalty() {
        return loyalty;
    }

    /**
     * Sets the value of the loyalty property.
     *
     * @param value allowed object is
     *              {@link Loyalty }
     */
    public void setLoyalty(Loyalty value) {
        this.loyalty = value;
    }

}
