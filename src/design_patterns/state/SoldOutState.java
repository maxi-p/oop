package design_patterns.state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine machine) {
        gumballMachine = machine;
    }

    public void insertQuarter() {
        System.out.println("You cannot insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Ejecting your quarter");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You cannot turn the crank when sold out");
    }

    public void dispense() {
        System.out.println("Cannot dispanse, we're sold out");
    }

    @Override
    public String toString() {
        return "Sold out";
    }
}
