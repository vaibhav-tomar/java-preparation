package vaibhav.systemdesign.designpattern.visitordesignpattern;

public interface HotelRoom {

    void accept(RoomVisitor visitor);
}
