package com.ibtech.thread;

public class MyLambaTest {
    public static void main(String[] args) {
        new Thread(() -> walk()).start();
        process();
    }

    private static void process() {
        while (true) {
            try {
                System.out.println("Sürüyor...");
                Thread.sleep(750);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void walk() {
        while (true) {
            try {
                System.out.println("Koşuyor...");
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
