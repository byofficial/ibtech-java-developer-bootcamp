package com.ibtech.enums;

public class DaysTest {

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
        int day = Days.TUESDAY;
        printDay(day);
    }
}

