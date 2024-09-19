package Command;

public class PowerOff implements Command {
    private Device device;

    public PowerOff(Device device){
        this.device = device;
    }


    @Override
    public String execute() {
        return device.switchOff();
    }
}
