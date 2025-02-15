package design_patterns.state;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine machine) {
        gumballMachine = machine;
    }

    public void insertQuarter() {
        System.out.println(("Please wait, we're already giving you a gumball"));
    }

    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning the crank twice doesn't get you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCountGumballs() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("Oops. out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "Sold state";
    }
}
