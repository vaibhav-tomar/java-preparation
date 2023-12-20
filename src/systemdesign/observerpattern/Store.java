package systemdesign.observerpattern;

import systemdesign.observerpattern.observable.IPhoneObservableImpl;
import systemdesign.observerpattern.observable.StockObservable;
import systemdesign.observerpattern.observer.EmailAlertObserverImpl;
import systemdesign.observerpattern.observer.NotificationAlertObserver;
import systemdesign.observerpattern.observer.SmsAlertObserverImpl;

public class Store {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("def@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new SmsAlertObserverImpl("123", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(5);

    }
}
