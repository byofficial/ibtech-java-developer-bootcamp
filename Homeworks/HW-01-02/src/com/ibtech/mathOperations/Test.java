package com.ibtech.mathOperations;

public class Test {
    public static void main(String[] args) {

        IdentityFunction f1 = new IdentityFunction();
        FunctionDrawer drawer = new FunctionDrawer();

        drawer.draw(f1, 10, 15, 100);

        System.out.println();
    }
}
