package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlCreate {

    public static void main(String[] args) throws Exception {

        Document document = XmlUtilities.create("student");
        Element student = document.getDocumentElement();
        student.setAttribute("id", "601");

        XmlUtilities.addSingleElementText(document, student, "name", "Yıldırım Gürses");
        XmlUtilities.addSingleElementText(document, student, "mark", 2.7);

        long id = XmlUtilities.getAttribute(student, "id", 0);
        String name = XmlUtilities.getSingleElementText(student, "name", "");
        double mark = XmlUtilities.getSingleElementText(student, "mark", 0);
        System.out.println(+id + " " + name + " " + mark);


        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Generated.xml";
        XmlUtilities.dump(document, path);
    }
}
