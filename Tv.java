package Command;

public class Tv implements Device{

    public String switchOn() {
        return "Tv is switched-on!";
    }

    public String switchOff(){
        return "Tv is switched-off";
    }

    public String increase(){
        return "Volume increased";
    }
    public String decrease(){
        return "Volume decreased";
    }
    
}
