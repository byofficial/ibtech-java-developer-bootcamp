package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlBuild {

    public static void main(String[] args) throws Exception {

        //JAXP
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Product.xml";
        Document document = XmlUtilities.parse(path);

        //DOM
        Element product = document.getDocumentElement();
        long id = XmlUtilities.getAttribute(product, "id", 0);
        System.out.println("Özdeşlik: " + id);

        String name = XmlUtilities.getSingleElementText(product, "name", "");
        System.out.println("Ad: " + name);

        double price = XmlUtilities.getSingleElementText(product, "price", 0);
        System.out.println("Eder: " + price);
    }
}
