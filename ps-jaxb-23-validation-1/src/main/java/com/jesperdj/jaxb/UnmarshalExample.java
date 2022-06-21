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
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

public class UnmarshalExample {

    public static void main(String[] args) throws JAXBException, SAXException {
        JAXBContext context = JAXBContext.newInstance("com.jesperdj.jaxb.domain");

        Unmarshaller unmarshaller = context.createUnmarshaller();

        SchemaFactory schemaFactory =
                SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("purchaseOrder.xsd"));

        unmarshaller.setSchema(schema);
        unmarshaller.setEventHandler(new ExampleValidationEventHandler());

        PurchaseOrder purchaseOrder =
                (PurchaseOrder) unmarshaller.unmarshal(new File("purchaseOrder.xml"));

        System.out.println("Customer name: " + purchaseOrder.getCustomer().getName());
    }
}
