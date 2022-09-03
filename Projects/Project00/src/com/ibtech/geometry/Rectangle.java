package com.ibtech.geometry;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(1, 1);
    }

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

}
