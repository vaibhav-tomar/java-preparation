package vaibhav.systemdesign.designpattern.commanddesignpattern;

import java.util.Stack;

public class MyRemoteControl {

    ICommand command;
    Stack<ICommand> acCommandHistory = new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        acCommandHistory.add(command);
        command.execute();
    }

    public void undo() {
        if (acCommandHistory.isEmpty() == false) {
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}
