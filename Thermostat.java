package Command;

public class Thermostat implements Device{
    public String switchOn(){
        return "Thermostat on";
    }

    public String switchOff(){
        return "Thermostat off";
    }

    public String increase(){
        return "Increasing temperature";
    }
    
    public String decrease(){
        return "Decreasing temperature";
    }
}
