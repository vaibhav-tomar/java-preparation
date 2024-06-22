package vaibhav.systemdesign.designpattern.withstrategypattern;

import vaibhav.systemdesign.designpattern.withstrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
