/*
 * UnmarshalExample.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb;

import java.io.File;
import com.jesperdj.jaxb.domain.Address;
import com.jesperdj.jaxb.domain.BillingAddress;
import com.jesperdj.jaxb.domain.PurchaseOrder;
import com.jesperdj.jaxb.domain.ShippingAddress;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;

public class UnmarshalExample {

    public static void main(String[] args) throws JAXBException, SAXException {
        JAXBContext context = JAXBContext.newInstance("com.jesperdj.jaxb.domain");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        PurchaseOrder purchaseOrder =
                (PurchaseOrder) unmarshaller.unmarshal(new File("purchaseOrder.xml"));

        for (Address address : purchaseOrder.getCustomer().getAddress()) {
            if (address instanceof ShippingAddress) {
                System.out.printf("Ship to: %s, %s %s, %s%n",
                        address.getStreet(), address.getCity(), address.getPostalCode(),
                        address.getCountry());
            } else if (address instanceof BillingAddress) {
                System.out.printf("Bill to: %s, %s %s, %s%n",
                        address.getStreet(), address.getCity(), address.getPostalCode(),
                        address.getCountry());
            }
        }
    }
}
