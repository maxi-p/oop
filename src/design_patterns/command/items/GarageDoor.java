package design_patterns.command.items;

public class GarageDoor {
    public void up() {
        System.out.println("Garage Door Up");
    };

    public void down() {
        System.out.println("Garage Door Down");
    }

    public void stop() {
        System.out.println("Garage Door Stop");
    }

    public void lightsOn() {
        System.out.println("Garage Door Lights On");
    }

    public void lightsOff() {
        System.out.println("Garage Door Lights Off");
    }

}
