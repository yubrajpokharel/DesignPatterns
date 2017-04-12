package com.yubraj.behavioral.strategy;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public class paypal implements Payment{

    private String email;
    private String password;

    public paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PAYPAL PAYMENT :: $"+amount);
    }
}
