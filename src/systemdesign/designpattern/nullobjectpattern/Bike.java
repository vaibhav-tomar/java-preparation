package systemdesign.designpattern.nullobjectpattern;

public class Bike implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 14;
    }

    @Override
    public int getSeatingCapacity() {
        return 2;
    }
}
