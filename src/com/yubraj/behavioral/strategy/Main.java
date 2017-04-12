package com.yubraj.behavioral.strategy;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public class Main {

    public static void main(String[] args) {
        Item item = new Item("apple", 100, "this is apple");
        Item item1 = new Item("banana", 455, "this is banana");

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);

        Payment payment = new CreditCard("Yubraj Pookharel", "lkj", "45784578548");
        shoppingCart.pay(payment);

    }
}
