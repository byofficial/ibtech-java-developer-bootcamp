package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XmlBuildList {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\Exam.xml";
        Document document = XmlUtilities.parse(path);

        Element exam = document.getDocumentElement();
        String id = XmlUtilities.getAttribute(exam, "id", "0");
        String title = XmlUtilities.getSingleElementText(exam, "title", "");
        System.out.println(id + " : " + title);

        NodeList questions = exam.getElementsByTagName("question");
        for (int i = 0; i < questions.getLength(); i++) {
            Element question = (Element) questions.item(i);
            String number = XmlUtilities.getAttribute(question, "number", "");
            String text = XmlUtilities.getSingleElementText(question, "text", "");
            System.out.println(number + ". " + text);
            NodeList options = question.getElementsByTagName("option");
            for (int j = 0; j < options.getLength(); j++) {
                Element option = (Element) options.item(j);
                String code = XmlUtilities.getAttribute(option, "code", "");
                String content = option.getTextContent();
                System.out.println("\t" + code + ") " + content);
            }
        }
    }
}
