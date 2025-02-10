package design_patterns.command.items;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    final String location;
    int speedn;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speedn = HIGH;
        System.out.println(location + " Ceiling Fan is set to HIGH");
    }

    public void medium() {
        speedn = MEDIUM;
        System.out.println(location + " Ceiling Fan is set to MEDIUM");
    }

    public void low() {
        speedn = LOW;
        System.out.println(location + " Ceiling Fan is set to LOW");
    }

    public void off() {
        speedn = OFF;
        System.out.println(location + " Ceiling Fan is OFF");
    }

    public int getSpeedn() {
        return speedn;
    }
}
