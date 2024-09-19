package Command;

public class ViewerApp {
    public static void main(String[] args){
        Tv tv = new Tv();
        Light light = new Light();
        MusicPlayer musicPlayer = new MusicPlayer();
        Thermostat thermostat = new Thermostat();
        RemoteControl rc = new RemoteControl();
        //for tv
        PowerOn powerOnTv = new PowerOn(tv);
        rc.setCommand(powerOnTv);
        rc.clickButton();

        Increase increaseTv = new Increase(tv);
        rc.setCommand(increaseTv);
        rc.clickButton();

        Decrease decreaseTv = new Decrease(tv);
        rc.setCommand(decreaseTv);
        rc.clickButton();

        PowerOff powerOffTv = new PowerOff(tv);
        rc.setCommand(powerOffTv);
        rc.clickButton();

        //for lights
        PowerOn powerOnLight = new PowerOn(light);
        rc.setCommand(powerOnLight);
        rc.clickButton();

        Increase increaseLight = new Increase(light);
        rc.setCommand(increaseLight);
        rc.clickButton();

        Decrease decreaseLight = new Decrease(light);
        rc.setCommand(decreaseLight);
        rc.clickButton();

        PowerOff powerOffLight = new PowerOff(light);
        rc.setCommand(powerOffLight);
        rc.clickButton();

        //for music player
        PowerOn powerOnMusic = new PowerOn(musicPlayer);
        rc.setCommand(powerOnMusic);
        rc.clickButton();

        Increase increaseMusicPlayer = new Increase(musicPlayer);
        rc.setCommand(increaseMusicPlayer);
        rc.clickButton();

        Decrease decreaseMusicPlayer = new Decrease(musicPlayer);
        rc.setCommand(increaseMusicPlayer);
        rc.clickButton();

        PowerOff powerOffMusic = new PowerOff(musicPlayer);
        rc.setCommand(powerOffMusic);
        rc.clickButton();
        
        //for thermostat
        PowerOn powerOnThermostat = new PowerOn(thermostat);
        rc.setCommand(powerOnThermostat);
        rc.clickButton();

        Increase increaseThermostat = new Increase(thermostat);
        rc.setCommand(increaseThermostat);
        rc.clickButton();

        Decrease decreaseThermostat = new Decrease(thermostat);
        rc.setCommand(decreaseThermostat);
        rc.clickButton();

        PowerOff powerOffThermostat = new PowerOff(thermostat);
        rc.setCommand(powerOffThermostat);
        rc.clickButton();
        

    }
}
