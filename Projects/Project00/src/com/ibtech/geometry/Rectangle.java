package com.ibtech.geometry;

public class Rectangle {
    int width;
    int height;

    int getArea() {
        return width * height;
    }

    int getPerimeter() {
        return 2 * (width + height);
    }

}
