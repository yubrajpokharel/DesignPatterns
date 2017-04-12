package com.yubraj.behavioral.observable;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public interface Subject {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
