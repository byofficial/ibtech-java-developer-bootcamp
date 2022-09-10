package com.ibtech.converter;

import com.ibtech.entity.Transaction;

public class TransactionConverter {
    public static final String DELIMITER = ";";

    public static Transaction parse(String line) {
        String[] tokens = line.split(DELIMITER);
        return new Transaction(Long.parseLong(tokens[0]), tokens[1], Double.parseDouble(tokens[2]));
    }

    public static String format(Transaction transaction) {
        StringBuffer builder = new StringBuffer();
        builder.append(transaction.getTransactionId()).append(DELIMITER)
                .append(transaction.getTransactionName()).append(DELIMITER)
                .append(transaction.getAmountLocal());
        return builder.toString();
    }
}
