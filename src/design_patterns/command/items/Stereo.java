package design_patterns.command.items;

public class Stereo {
    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("Stereo is setCd");
    }

    public void setDvd() {
        System.out.println("Stereo is setDvd");
    }

    public void setRadio() {
        System.out.println("Stereo is setRadio");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume set is to " + volume);
    }
}
