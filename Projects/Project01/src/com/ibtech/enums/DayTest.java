package com.ibtech.enums;

public class DayTest {
    private static void printDay(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Geçersiz gün düzgüsü");
                break;
        }
    }

    public static void main(String[] args) {
        Day day = Day.TUESDAY;
        printDay(day);
        //int day2 = 47;

    }
}
