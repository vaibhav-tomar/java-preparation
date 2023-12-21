package systemdesign.designpattern.withstrategypattern;

import systemdesign.designpattern.withstrategypattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
