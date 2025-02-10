package design_patterns.strategy;

public class IndexPosition implements Position {
    private int index;

    @Override
    public void print() {
        System.out.println("Index: " + index);
    }
}
