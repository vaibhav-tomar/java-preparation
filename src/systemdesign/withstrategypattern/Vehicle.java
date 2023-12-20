package systemdesign.withstrategypattern;

import lombok.Data;
import systemdesign.withstrategypattern.strategy.DriveStrategy;

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
