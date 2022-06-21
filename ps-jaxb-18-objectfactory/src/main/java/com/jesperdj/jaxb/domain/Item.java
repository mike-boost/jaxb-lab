/*
 * Item.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb.domain;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementRef;

public class Item {
    private String productName;
    private int quantity;
    private BigDecimal price;

    @XmlElementRef(namespace = "http://www.jesperdj.com/ps-jaxb", name = "comment", required = false)
    private JAXBElement<String> comment;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public JAXBElement<String> getComment() {
        return comment;
    }

    public void setComment(JAXBElement<String> comment) {
        this.comment = comment;
    }
}
