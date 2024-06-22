package vaibhav.systemdesign.designpattern.withstrategypattern;

import vaibhav.systemdesign.designpattern.withstrategypattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
