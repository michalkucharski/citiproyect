package com.citibank.transactions.exceptions;

public class TransactionNotFoundException extends  Exception{

    public TransactionNotFoundException(String message) {
        super(message);
    }
}
