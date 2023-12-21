package systemdesign.designpattern.withstrategypattern;

import lombok.Data;
import systemdesign.designpattern.withstrategypattern.strategy.DriveStrategy;

@Data
public class Vehicle {

    public DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
