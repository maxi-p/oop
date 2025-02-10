package design_patterns.strategy;

public class Knight extends ChessPiece{
    public Knight(Color pieceColor) {
        color = pieceColor;
        move = new KnighMove();
        position = new RowColPosition();
    }

    @Override
    public void display() {
        System.out.print("Knight, ");
        color.print();
    }

}
