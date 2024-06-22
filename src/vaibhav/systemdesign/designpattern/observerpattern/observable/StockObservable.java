package vaibhav.systemdesign.designpattern.observerpattern.observable;

import vaibhav.systemdesign.designpattern.observerpattern.observer.NotificationAlertObserver;

public interface StockObservable {
    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public int getStockCount();

    public void setStockCount(int newCount);

}
