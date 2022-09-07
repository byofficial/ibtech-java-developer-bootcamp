package com.ibtech.mathOperations;

public class Test {
    public static void main(String[] args) {

        IdentityFunction f1 = new IdentityFunction();
        FunctionDrawer drawer = new FunctionDrawer();

        drawer.draw(f1, 10, 15, 100);

        System.out.println("-----------------------------\n");

        System.out.println("QuadraticPolynomial");
        MathFunction quadraticPolynomial = new QuadraticPolynomial(2, -3, 5);
        drawer.draw(quadraticPolynomial, -5, 5, 100);

        System.out.println("-----------------------------\n");

        System.out.println("SinusoidalPolynomial");
        MathFunction sinusoidalPolynomial = new SinusoidalPolynomial(1, 3, 5);
        drawer.draw(sinusoidalPolynomial, -Math.PI, Math.PI, 100);

        System.out.println("-----------------------------");
    }
}
