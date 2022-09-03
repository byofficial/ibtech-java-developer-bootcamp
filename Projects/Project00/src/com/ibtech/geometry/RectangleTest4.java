package com.ibtech.geometry;

public class RectangleTest4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 3;
        rectangle.height = 4;

        System.out.println("Alan: " + rectangle.getArea());
        System.out.println("Çevrel: " + rectangle.getPerimeter());
    }
}
