package com.yubraj.behavioral.observable;

import java.util.ArrayList;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int observerIndex = observers.indexOf(o);
        System.out.println("Observer "+ (observerIndex + 1) + " has been deleted!");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers)
            observer.update(ibmPrice, applPrice, googPrice);
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplPrice(double applPrice) {
        this.applPrice = applPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }
}
