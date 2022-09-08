package com.ibtech.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\burak\\IdeaProjects\\ExPath\\in.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = null;
        String text = "";
        while ((line = br.readLine()) != null) {
            text += line + "\r\n";
        }
        System.out.println("Yazı:\n" + text);
        br.close();
    }
}
