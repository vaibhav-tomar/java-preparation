package vaibhav.systemdesign.designpattern.visitordesignpattern;

public interface RoomVisitor {
    void visit(SingleRoom singleRoomObj);

    void visit(DoubleRoom doubleRoomObj);

    void visit(DeluxeRoom deluxeRoomObject);
}
