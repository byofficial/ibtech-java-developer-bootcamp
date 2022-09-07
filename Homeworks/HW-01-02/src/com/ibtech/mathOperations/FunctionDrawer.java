package com.ibtech.mathOperations;

import java.util.Locale;

public class FunctionDrawer {
    void draw(MathFunction function, double x1, double x2, int n) {
        double dx = (x2 - x1) / n;
        for (double x = x1; x < x2; x += dx) {
            double y = function.evaluate(x);
            System.out.format(Locale.US, "(%.2f , %.2f)\n", x, y);
        }
    }
}
