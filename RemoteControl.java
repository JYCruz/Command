package Command;

public class RemoteControl {
    private Command command;
    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void clickButton(){
        System.out.println(command.execute());
    }
}
