package systemdesign.designpattern.templatedesignpattern;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("validate to merchant");
    }

    @Override
    public void calculateFee() {
        System.out.println("calculate fee for merchant");
    }

    @Override
    public void debit() {
        System.out.println("debit for merchant");
    }

    @Override
    public void credit() {
        System.out.println("credit for merchant");
    }
}
