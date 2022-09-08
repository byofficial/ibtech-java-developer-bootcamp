package com.ibtech.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\in.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = null;
        StringBuilder builder = new StringBuilder();
        while ((line = br.readLine()) != null) {
            builder.append(line).append("\r\n");
        }
        System.out.println("Yazı:\n" + builder.toString());
        br.close();
    }
}
