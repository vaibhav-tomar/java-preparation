package vaibhav.systemdesign.designpattern.withstrategypattern;

import vaibhav.systemdesign.designpattern.withstrategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
