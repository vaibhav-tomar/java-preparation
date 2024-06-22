package vaibhav.systemdesign.designpattern.visitordesignpattern;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoomObj) {
        System.out.println("Pricing computation logic  of single room");
        singleRoomObj.roomPrice = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoomObj) {
        System.out.println("Pricing computation logic  of double room");
        doubleRoomObj.roomPrice = 3000;
    }

    @Override
    public void visit(DeluxeRoom deluxeRoomObject) {
        System.out.println("Pricing computation logic  of deluxe room");
        deluxeRoomObject.roomPrice = 6000;
    }
}
