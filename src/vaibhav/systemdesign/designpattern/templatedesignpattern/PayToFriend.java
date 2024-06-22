package vaibhav.systemdesign.designpattern.templatedesignpattern;

public class PayToFriend extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("validate for friend");
    }

    @Override
    public void calculateFee() {
        System.out.println("calculate fee for friend");
    }

    @Override
    public void debit() {
        System.out.println("debit for friend");
    }

    @Override
    public void credit() {
        System.out.println("credit for friend");
    }
}
