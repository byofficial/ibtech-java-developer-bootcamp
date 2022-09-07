package com.ibtech.statics;

public class BankAccount {
    private double investment;
    private static double rate;

    public double getAmount(int month) {
        return investment * (1 + month * rate / (12 * 100));
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }
}
