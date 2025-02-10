package design_patterns.command.items;

public class Light {
    String name;
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println("Light on");
    }
    public void off() {
        System.out.println("Light off");
    }
}
