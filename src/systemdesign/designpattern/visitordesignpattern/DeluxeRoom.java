package systemdesign.designpattern.visitordesignpattern;

public class DeluxeRoom implements HotelRoom {

    public int roomPrice;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
