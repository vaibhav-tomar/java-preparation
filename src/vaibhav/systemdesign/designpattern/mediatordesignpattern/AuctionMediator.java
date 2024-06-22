package vaibhav.systemdesign.designpattern.mediatordesignpattern;

public interface AuctionMediator {

    void addBidder(Colleague bidder);

    void placeBid(Colleague bidder, int amount);
}
