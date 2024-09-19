package Command;

public class Light implements Device{

    public String switchOn() {
        return "Light is switched-on!";
    }

    public String switchOff(){
        return "Light is switched-off";
    }

    public String increase(){
        return "Brightness increased";
    }

    public String decrease(){
        return "Brightness decreased";
    }
}
