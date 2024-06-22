package vaibhav.systemdesign.designpattern.visitordesignpattern;

public class Client {
    public static void main(String[] args) {
        HotelRoom singleRoom = new SingleRoom();
        HotelRoom doubleRoom = new DoubleRoom();
        HotelRoom deluxeRoom = new DeluxeRoom();

        RoomVisitor roomPricingVisitor = new RoomPricingVisitor();
        singleRoom.accept(roomPricingVisitor);
        doubleRoom.accept(roomPricingVisitor);
        deluxeRoom.accept(roomPricingVisitor);

        RoomVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomMaintenanceVisitor);
        doubleRoom.accept(roomMaintenanceVisitor);
        deluxeRoom.accept(roomMaintenanceVisitor);
    }


}
