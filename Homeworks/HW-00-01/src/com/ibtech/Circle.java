package com.ibtech;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Yarıçap eksi olamaz: " + radius);
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
