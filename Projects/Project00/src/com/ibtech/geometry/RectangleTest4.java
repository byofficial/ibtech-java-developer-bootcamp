package com.ibtech.geometry;

public class RectangleTest4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);

        rectangle.setWidth(4);
        rectangle.setHeight(5);

        System.out.println("Alan: " + rectangle.getArea());
        System.out.println("Çevrel: " + rectangle.getPerimeter());
    }
}
