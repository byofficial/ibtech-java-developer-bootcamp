package com.ibtech.console;

public class FormatterTest {
    public static void main(String[] args) {
        long l = 3;
        String s = "Godoro";
        double d = 3.1415;
        System.out.printf("Uzun: %10d Sicim: %-20s İkişer: %11.2f\n", l, s, d);
    }
}
