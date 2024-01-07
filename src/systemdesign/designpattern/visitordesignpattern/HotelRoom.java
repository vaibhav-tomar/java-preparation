package systemdesign.designpattern.visitordesignpattern;

public interface HotelRoom {

    void accept(RoomVisitor visitor);
}
