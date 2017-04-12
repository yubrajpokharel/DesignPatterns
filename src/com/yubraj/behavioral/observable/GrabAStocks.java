package com.yubraj.behavioral.observable;

/**
 * Created by ypokhrel on 4/11/2017.
 */
public class GrabAStocks {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver stockObserver = new StockObserver(stockGrabber);

        stockGrabber.setApplPrice(100);
        stockGrabber.setGoogPrice(200);
        stockGrabber.setIbmPrice(300);

        StockObserver stockObserver2 = new StockObserver(stockGrabber);

        stockGrabber.setApplPrice(100);
        stockGrabber.setGoogPrice(200);
        stockGrabber.setIbmPrice(300);

    }
}
