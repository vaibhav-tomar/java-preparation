package systemdesign.designpattern.adapterdesignpattern.client;


import systemdesign.designpattern.adapterdesignpattern.adaptee.WeightMachineForBabies;
import systemdesign.designpattern.adapterdesignpattern.adapter.WeightMachineAdapter;
import systemdesign.designpattern.adapterdesignpattern.adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
