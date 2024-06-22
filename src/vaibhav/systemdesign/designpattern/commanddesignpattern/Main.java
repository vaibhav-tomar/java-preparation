package vaibhav.systemdesign.designpattern.commanddesignpattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();

        MyRemoteControl remoteControl = new MyRemoteControl();
        remoteControl.setCommand(new TurnAcOnCommand(ac));
        remoteControl.pressButton();
        remoteControl.setCommand(new TurnAcOffCommand(ac));
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
