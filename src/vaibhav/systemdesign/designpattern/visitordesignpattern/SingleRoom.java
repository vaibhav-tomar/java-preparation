package vaibhav.systemdesign.designpattern.visitordesignpattern;

public class SingleRoom implements HotelRoom {

    public int roomPrice;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
