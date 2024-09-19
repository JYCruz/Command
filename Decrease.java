package Command;

public class Decrease implements Command{
    private Device device;

    public Decrease(Device device){
        this.device = device;
    }

    @Override
    public String execute() {
        return device.decrease();
    }
}
