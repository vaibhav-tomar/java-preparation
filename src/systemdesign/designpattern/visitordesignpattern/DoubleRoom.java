package systemdesign.designpattern.visitordesignpattern;

public class DoubleRoom implements HotelRoom {

    public int roomPrice;

    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
