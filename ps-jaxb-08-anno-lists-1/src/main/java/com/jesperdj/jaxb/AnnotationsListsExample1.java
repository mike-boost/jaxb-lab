/*
 * AnnotationsListsExample1.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import com.jesperdj.jaxb.domain.Address;
import com.jesperdj.jaxb.domain.Customer;
import com.jesperdj.jaxb.domain.Item;
import com.jesperdj.jaxb.domain.Items;
import com.jesperdj.jaxb.domain.Loyalty;
import com.jesperdj.jaxb.domain.PurchaseOrder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class AnnotationsListsExample1 {

    public static void main(String[] args) throws JAXBException {
        PurchaseOrder purchaseOrder = createPurchaseOrder();

        JAXBContext context = JAXBContext.newInstance(PurchaseOrder.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Marshal and output to the console
        marshaller.marshal(purchaseOrder, System.out);
    }

    private static PurchaseOrder createPurchaseOrder() {
        PurchaseOrder purchaseOrder = new PurchaseOrder();

        purchaseOrder.setOrderDate(new Date());

        Item item1 = new Item();
        item1.setProductName("Ballpoint Pen");
        item1.setQuantity(20);
        item1.setPrice(new BigDecimal("8.95"));
        item1.setComment("Blue ink");

        Item item2 = new Item();
        item2.setProductName("Pencil");
        item2.setQuantity(10);
        item2.setPrice(new BigDecimal("2.95"));

        Items items = new Items();
        items.setItem(Arrays.asList(item1, item2));

        purchaseOrder.setItems(items);

        Customer customer = new Customer();
        customer.setName("John Doe");

        Address address = new Address();
        address.setStreet("123 Main Street");
        address.setCity("Exampleville");
        address.setPostalCode("12345");
        address.setCountry("USA");

        customer.setShippingAddress(address);
        customer.setBillingAddress(address);
        customer.setLoyalty(Loyalty.SILVER);

        purchaseOrder.setCustomer(customer);

        return purchaseOrder;
    }
}
