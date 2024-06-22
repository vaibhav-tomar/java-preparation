package vaibhav.systemdesign.designpattern.nullobjectpattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle("truck");
        System.out.println("Tank capacity: " + vehicle.getTankCapacity());
        System.out.println("Seating capacity: " + vehicle.getSeatingCapacity());
    }
}
