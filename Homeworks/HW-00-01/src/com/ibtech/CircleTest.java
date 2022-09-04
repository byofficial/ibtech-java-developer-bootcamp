package com.ibtech;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);

        System.out.format("Alan: %.2f", circle.getArea());
        System.out.format("\nÇevre: %.2f", circle.getPerimeter());
    }
}
