package com.ibtech.mathOperations;

public class SinusoidalPolynomial implements MathFunction {
    private double m, w, p;

    public SinusoidalPolynomial(double m, double w, double p) {
        this.m = m;
        this.w = w;
        this.p = p;
    }

    @Override
    public double evaluate(double x) {
        return m * Math.sin(w * x + p);
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }
}
