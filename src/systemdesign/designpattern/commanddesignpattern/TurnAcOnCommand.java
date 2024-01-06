package systemdesign.designpattern.commanddesignpattern;

public class TurnAcOnCommand implements ICommand {

    AirConditioner ac;

    TurnAcOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        ac.turnOffAc();
    }
}
