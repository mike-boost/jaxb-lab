/*
 * CustomerType.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.27 at 03:45:35 PM CEST 
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
 *         &lt;element name="phoneNumber" type="{http://www.jesperdj.com/ps-jaxb}phoneNumber"/>
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
        "phoneNumber",
        "loyalty"
})
public class CustomerType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected AddressType shippingAddress;
    @XmlElement(required = true)
    protected AddressType billingAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PhoneNumberType phoneNumber;
    @XmlElement(required = true, defaultValue = "BRONZE")
    @XmlSchemaType(name = "string")
    protected LoyaltyType loyalty;

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
     * {@link AddressType }
     */
    public AddressType getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets the value of the shippingAddress property.
     *
     * @param value allowed object is
     *              {@link AddressType }
     */
    public void setShippingAddress(AddressType value) {
        this.shippingAddress = value;
    }

    /**
     * Gets the value of the billingAddress property.
     *
     * @return possible object is
     * {@link AddressType }
     */
    public AddressType getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     *
     * @param value allowed object is
     *              {@link AddressType }
     */
    public void setBillingAddress(AddressType value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     *
     * @return possible object is
     * {@link PhoneNumberType }
     */
    public PhoneNumberType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     *
     * @param value allowed object is
     *              {@link PhoneNumberType }
     */
    public void setPhoneNumber(PhoneNumberType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the loyalty property.
     *
     * @return possible object is
     * {@link LoyaltyType }
     */
    public LoyaltyType getLoyalty() {
        return loyalty;
    }

    /**
     * Sets the value of the loyalty property.
     *
     * @param value allowed object is
     *              {@link LoyaltyType }
     */
    public void setLoyalty(LoyaltyType value) {
        this.loyalty = value;
    }

}
