package com.ibtech.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\out.txt";
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Java");
        bw.write("JDBC");
        bw.write("JAXP");
        bw.write("JSON-P");
        bw.write("JSON");
        bw.close();
    }
}
