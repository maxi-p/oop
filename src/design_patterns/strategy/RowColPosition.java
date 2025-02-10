package design_patterns.strategy;

public class RowColPosition implements Position {
    private int row;
    private int col;

    @Override
    public void print() {
        System.out.println("Row: " + row + ", Col: " + col);
    }
}
