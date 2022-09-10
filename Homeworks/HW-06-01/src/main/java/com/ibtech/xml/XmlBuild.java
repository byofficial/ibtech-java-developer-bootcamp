package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlBuild {

    public static void main(String[] args) throws Exception {

        //JAXP
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Student.xml";
        Document document = XmlUtilities.parse(path);

        //DOM
        Element student = document.getDocumentElement();
        long id = XmlUtilities.getAttribute(student, "id", 0);
        System.out.println("Özdeşlik: " + id);

        String name = XmlUtilities.getSingleElementText(student, "name", "");
        System.out.println("Ad: " + name);

        double mark = XmlUtilities.getSingleElementText(student, "mark", 0);
        System.out.println("Not: " + mark);
    }
}
