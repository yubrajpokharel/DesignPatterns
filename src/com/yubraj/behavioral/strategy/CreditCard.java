package com.yubraj.behavioral.strategy;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public class CreditCard implements Payment{

    private String name;
    private String cvv;
    private String cardNumber;

    public CreditCard(String name, String cvv, String cardNumber) {
        this.name = name;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CREDIT CARD PAYMENT :: $"+amount);
    }
}
