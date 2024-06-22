package vaibhav.systemdesign.designpattern.nullobjectpattern;

public class Car implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 37;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
