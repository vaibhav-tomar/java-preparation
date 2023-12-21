package systemdesign.designpattern.observerpattern.observer;

import systemdesign.designpattern.observerpattern.observable.StockObservable;

public class SmsAlertObserverImpl implements NotificationAlertObserver {
    String mobile;
    StockObservable stockObservable;

    public SmsAlertObserverImpl(String mobile, StockObservable stockObservable) {
        this.mobile = mobile;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendSms(mobile, "product is back in stock, hurry up!");
    }

    private void sendSms(String mobile, String msg) {
        // send sms
        System.out.println("sms sent to: " + mobile);
    }
}
