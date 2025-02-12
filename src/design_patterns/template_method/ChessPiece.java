package design_patterns.template_method;

public class ChessPiece implements Comparable<ChessPiece> {
    public String name;
    public int value;

    public ChessPiece(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(ChessPiece other) {
        return this.value - other.value;
    }

    @Override
    public String toString() {
        return name + " " + value;
    }
}
