package design_patterns.strategy;


public abstract class ChessPiece {
    public Color color;
    public MovingBehavior move;
    public Position position;

    public abstract void display();

    public void printColor(){
        color.print();
    }

    public void printPossibleMoves() {
        move.print();
    }

    public void getPosition() {
        position.print();
    }
}
