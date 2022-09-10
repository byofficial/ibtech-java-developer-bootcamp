package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlBuild {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Product.xml";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(path);

        Element product = document.getDocumentElement();
        String id = product.getAttribute("id");
        System.out.println("Özdeşlik: " + id);

        String name = product.getElementsByTagName("name").item(0).getTextContent();
        System.out.println("Ad: " + name);

        String price = product.getElementsByTagName("price").item(0).getTextContent();
        System.out.println("Ad: " + price);
    }
}
