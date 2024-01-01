package systemdesign.designpattern.adapterdesignpattern.adaptee;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPound() {
        return 28;
    }
}
