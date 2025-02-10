package design_patterns.strategy;

public class Bishop extends ChessPiece{
    public Bishop(Color pieceColor) {
        color = pieceColor;
        move = new BishopMove();
        position = new RowColPosition();
    }

    @Override
    public void display(){
        System.out.println("Bishop, ");
        color.print();
    }
}
