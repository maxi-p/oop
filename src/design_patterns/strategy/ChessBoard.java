package design_patterns.strategy;

public class ChessBoard {
    public static void main(String[] args) {
        Color whitePiece = new WhitePiece();
        Color blackPiece = new BlackPiece();

        ChessPiece blackKnight = new Knight(blackPiece);
        ChessPiece whiteBishop = new Bishop(whitePiece);

        blackKnight.printColor();
        blackKnight.printPossibleMoves();
        blackKnight.getPosition();

        System.out.println();

        whiteBishop.printColor();
        whiteBishop.printPossibleMoves();
        whiteBishop.getPosition();
    }
}
