package vaibhav.systemdesign.designpattern.adapterdesignpattern.client;


import vaibhav.systemdesign.designpattern.adapterdesignpattern.adaptee.WeightMachineForBabies;
import vaibhav.systemdesign.designpattern.adapterdesignpattern.adapter.WeightMachineAdapter;
import vaibhav.systemdesign.designpattern.adapterdesignpattern.adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String args[]) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
