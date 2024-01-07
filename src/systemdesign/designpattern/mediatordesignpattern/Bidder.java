package systemdesign.designpattern.mediatordesignpattern;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder " + name + " has receiver notification that someone has placed a bid of: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
