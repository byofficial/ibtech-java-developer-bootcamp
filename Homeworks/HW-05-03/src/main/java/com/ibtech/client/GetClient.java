package com.ibtech.client;

import com.ibtech.converter.TransactionConverter;
import com.ibtech.entity.Transaction;
import com.ibtech.utils.StreamUtilities;

public class GetClient {
    public static void main(String[] args) throws Exception {
        String address = "http://localhost:8080/HW_05_03_war/get?transactionId=501&transactionName=Elektrik%20Odemesi&amountLocal=5460";
        String text = StreamUtilities.get(address);
        Transaction transaction = TransactionConverter.parse(text);
        System.out.println(transaction.getTransactionId() + " "
                + transaction.getTransactionName() + " "
                + transaction.getAmountLocal());

    }
}
