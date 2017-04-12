package com.yubraj.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public class ShoppingCart {
    private List<Item> items;
    private int total;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public int calculateTotal(){
        total = 0;
        for(Item item: items)
            total += item.getPrice();

        System.out.println("Total price in the cart :: "+this.total);
        return total;
    }

    public void pay(Payment payment){
        payment.pay(calculateTotal());
    }

}
