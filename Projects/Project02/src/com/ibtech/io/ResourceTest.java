package com.ibtech.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResourceTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

            bw.write("Java\r\n");
            bw.write("JDBC\r\n");
            bw.write("JAXP\r\n");
            bw.write("JSON-P\r\n");
            bw.write("JSON\r\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
