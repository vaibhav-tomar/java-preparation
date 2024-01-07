package systemdesign.designpattern.mementodesignpattern;

public class Client {

    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(1, 2);
        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();
        careTaker.addMemento(snapshot1);


        // originator changing to new state
        configurationOriginator.setWidth(4);
        configurationOriginator.setHeight(5);

        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();
        careTaker.addMemento(snapshot2);

        configurationOriginator.setHeight(8);
        configurationOriginator.setWidth(9);

        configurationOriginator.restoreMemento(careTaker.undo());

        System.out.println(configurationOriginator);
    }
}
