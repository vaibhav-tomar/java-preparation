package vaibhav.systemdesign.designpattern.commanddesignpattern;

public class TurnAcOffCommand implements ICommand {

    AirConditioner ac;

    TurnAcOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }
}
