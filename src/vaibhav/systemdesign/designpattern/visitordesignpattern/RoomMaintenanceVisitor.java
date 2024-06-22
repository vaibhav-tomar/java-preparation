package vaibhav.systemdesign.designpattern.visitordesignpattern;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Performing maintenance of single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Performing maintenance of double room");

    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObject) {
        System.out.println("Performing maintenance of deluxe room");

    }
}
