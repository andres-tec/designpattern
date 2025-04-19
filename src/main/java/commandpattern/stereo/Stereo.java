package commandpattern.stereo;

public class Stereo {

    public void on(){
        System.out.println("Stereo is on");
    }

    public void off(){
        System.out.println("Stereo is Off");

    }

    public void setCD(){
        System.out.println("cd has been inserted, ready to take a listen?");
    }

    public void setDvd(){
        System.out.println("Dvd mode has been set");
    }

    public void setRadio(){
        System.out.println("Radio is set la que buena is transmitting");
    }

    public void setVolume(int level){
        System.out.println("valume level: "+ level);
    }
}
