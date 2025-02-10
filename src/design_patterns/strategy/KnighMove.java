package design_patterns.strategy;

public class KnighMove implements MovingBehavior {
    @Override
    public void print() {
        System.out.println("L shape move");
    }
}
