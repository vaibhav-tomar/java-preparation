package vaibhav.systemdesign.designpattern.nullobjectpattern;

public class VehicleFactory {

    Vehicle getVehicle(String vehicleType) {
        if (vehicleType.equals("car")) {
            return new Car();
        } else if (vehicleType.equals("bike")) {
            return new Bike();
        }
        return new NullVehicle();
    }
}
