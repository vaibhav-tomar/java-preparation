package vaibhav.systemdesign.designpattern.observerpattern.observer;

import vaibhav.systemdesign.designpattern.observerpattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is back in stock, hurry up!");
    }

    private void sendEmail(String emailId, String msg) {
        // send email
        System.out.println("mail sent to: " + emailId);
    }
}
