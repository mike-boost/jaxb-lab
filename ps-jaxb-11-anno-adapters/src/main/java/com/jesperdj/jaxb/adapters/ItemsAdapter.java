/*
 * ItemsAdapter.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb.adapters;

import java.util.Map;
import java.util.stream.Collectors;
import com.jesperdj.jaxb.domain.Item;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class ItemsAdapter extends XmlAdapter<ItemsWrapper, Map<String, Item>> {

    @Override
    public ItemsWrapper marshal(Map<String, Item> map) throws Exception {
        return new ItemsWrapper(map.entrySet().stream()
                .map(entry -> new ItemValue(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList()));
    }

    @Override
    public Map<String, Item> unmarshal(ItemsWrapper wrapper) throws Exception {
        return wrapper.getItems().stream()
                .collect(Collectors.toMap(ItemValue::getProductCode, ItemValue::toItem));
    }
}
