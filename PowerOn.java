package Command;

public class PowerOn implements Command {

    private Device device;
    public PowerOn(Device device){
        this.device = device;
    }
    @Override
    public String execute() {
        return device.switchOn();
    }

}
