package com.ibtech.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\out.txt";
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Java\r\n");
        bw.write("JDBC\r\n");
        bw.write("JAXP\r\n");
        bw.write("JSON-P\r\n");
        bw.write("JSON\r\n");
        bw.close();
    }
}
