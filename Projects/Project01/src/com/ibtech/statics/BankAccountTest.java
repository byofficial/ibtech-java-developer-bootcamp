package com.ibtech.statics;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount.setRate(24);
        BankAccount account1 = new BankAccount();
        account1.setInvestment(3000);
        System.out.println("Tutar I: " + account1.getAmount(9));

        BankAccount account2 = new BankAccount();
        account2.setInvestment(4000);
        System.out.println("Tutar II: " + account2.getAmount(9));
    }
}
