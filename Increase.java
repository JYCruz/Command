package Command;

public class Increase implements Command{
    private Device device;

    public Increase(Device device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.increase();
    }
}
