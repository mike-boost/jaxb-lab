/*
 * ItemsWrapper.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb.adapters;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;

public class ItemsWrapper {
    private List<ItemValue> items;

    public ItemsWrapper() {
    }

    public ItemsWrapper(List<ItemValue> items) {
        this.items = items;
    }

    @XmlElement(name = "item")
    public List<ItemValue> getItems() {
        return items;
    }

    public void setItems(List<ItemValue> items) {
        this.items = items;
    }
}
