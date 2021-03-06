/*
 * UnmarshalExample.java
 *
 * Created on 2022-06-21
 *
 * Copyright (C) 2022 Volkswagen AG, All rights reserved.
 */

package com.jesperdj.jaxb;

import java.io.File;
import com.jesperdj.jaxb.domain.PurchaseOrder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class UnmarshalExample {

    public static void main(String[] args) throws JAXBException, SAXException {
        JAXBContext context = JAXBContext.newInstance("com.jesperdj.jaxb.domain");
        Unmarshaller unmarshaller = context.createUnmarshaller();

        PurchaseOrder purchaseOrder =
                (PurchaseOrder) unmarshaller.unmarshal(new File("purchaseOrder.xml"));

        for (Object object : purchaseOrder.getExtra().getAny()) {
            if (object instanceof Element) {
                Element element = (Element) object;
                System.out.println("Extra information as a DOM element: " + element.getNodeName());
            } else {
                System.out.println("Extra information of type: " + object.getClass().getName());
            }
        }
    }
}
