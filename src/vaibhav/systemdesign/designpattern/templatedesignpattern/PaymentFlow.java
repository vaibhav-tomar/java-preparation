package vaibhav.systemdesign.designpattern.templatedesignpattern;

public abstract class PaymentFlow {
    public abstract void validateRequest();

    public abstract void calculateFee();

    public abstract void debit();

    public abstract void credit();

    public final void sendMoney() {
        validateRequest();
        calculateFee();
        debit();
        credit();
    }
}
