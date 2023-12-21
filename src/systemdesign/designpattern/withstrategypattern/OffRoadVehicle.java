package systemdesign.designpattern.withstrategypattern;

import systemdesign.designpattern.withstrategypattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
