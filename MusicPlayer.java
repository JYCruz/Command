package Command;

public class MusicPlayer implements Device{
    
    public String switchOn(){
        return "Music player on. Playing playlist";
    }

    public String switchOff(){
        return "Music player off. Stopping music";
    }

    public String increase(){
        return "Volume increased";
    }

    public String decrease(){
        return "Volume decreased";
    }
    
}
