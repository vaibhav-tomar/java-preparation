package vaibhav.systemdesign.designpattern.mediatordesignpattern;

public interface Colleague {
    void placeBid(int bidAmount);

    void receiveBidNotification(int bidAmount);

    String getName();
}
