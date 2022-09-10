package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlBuild {

    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Students.xml";
        Document document = XmlUtilities.parse(path);

        Element studentList = document.getDocumentElement();

        NodeList students = studentList.getElementsByTagName("student");
        for (int i = 0; i < students.getLength(); i++) {
            Element student = (Element) students.item(i);
            long id = XmlUtilities.getAttribute(student, "id", 0);
            String name = XmlUtilities.getSingleElementText(student, "name", "");
            double mark = XmlUtilities.getSingleElementText(student, "mark", 0);
            System.out.println(id + " " + name + " " + mark);


        }
    }
}
