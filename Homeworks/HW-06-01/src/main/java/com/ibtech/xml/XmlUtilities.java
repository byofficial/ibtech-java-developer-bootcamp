package com.ibtech.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XmlUtilities {
    private static DocumentBuilderFactory factory;

    public static DocumentBuilderFactory getFactory() {
        if (factory == null) {
            factory = DocumentBuilderFactory.newInstance();
        }
        return factory;
    }

    public static Document parse(String path)
            throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = getFactory().newDocumentBuilder();
        Document document = builder.parse(path);
        return document;
    }

    public static String getSingleElementText(Element parent, String tag, String defaultValue) {
        NodeList elementList = parent.getElementsByTagName(tag);
        if (elementList.getLength() == 0) {
            return defaultValue;
        }
        return elementList.item(0).getTextContent();
    }

    public static double getSingleElementText(Element parent, String tag, double defaultValue) {
        String string = getSingleElementText(parent, tag, Double.toString(defaultValue));
        return Double.parseDouble(string);
    }

    public static String getAttribute(Element element, String name, String defaultValue) {
        if (!element.hasAttribute(name)) {
            return defaultValue;
        }
        return element.getAttribute(name);
    }

    public static long getAttribute(Element element, String name, long defaultValue) {
        String string = getAttribute(element, name, Long.toString(defaultValue));
        return Long.parseLong(string);
    }
}
