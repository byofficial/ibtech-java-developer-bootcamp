package com.ibtech.console;

import java.util.StringTokenizer;

public class TokenizerTest {
    public static void main(String[] args) {
        String string = "Java, JDBC, JSP, JAXB, JSON-P, JAX-WS, JAX-RS";
        String[] tokens = string.split(", ");
        for (String token: tokens) {
            System.out.println("* " + token);
        }

        StringTokenizer tokenizer = new StringTokenizer(string," ,;.");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("# " + token);
    }
}
}
