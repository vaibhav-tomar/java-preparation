package systemdesign.designpattern.withstrategypattern;

import systemdesign.designpattern.withstrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
