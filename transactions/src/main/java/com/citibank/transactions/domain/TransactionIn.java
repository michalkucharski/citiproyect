package com.citibank.transactions.domain;

public record TransactionIn(String transactionId, double amount, String paymentMethod, String goodsType, String taxCat) {
}
