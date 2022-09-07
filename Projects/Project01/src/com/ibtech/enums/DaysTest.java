package com.ibtech.enums;

public class DaysTest {
    public final static int MONDAY = 1;
    public final static int TUESDAY = 2;
    public final static int WEDNESDAY = 3;

    private static void printDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Paartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            default:
                System.out.println("Geçersiz gün düzgüsü");
        }
    }

    public static void main(String[] args) {
        int day = TUESDAY;
        printDay(day);
    }
}

