package design_patterns.template_method;

import design_patterns.template_method.impl.NimzoIndianDefense;
import design_patterns.template_method.impl.QueensGambit;
import design_patterns.template_method.impl.SlavDefense;

import java.util.Arrays;

public class TemplateRunner {
    public static void main(String[] args) {
        QueenPawnOpening queensGambit = new QueensGambit();
        QueenPawnOpening slavDefense = new SlavDefense();
        QueenPawnOpening nimzoIndianDefense = new NimzoIndianDefense();

        queensGambit.playTheOpening();
        slavDefense.playTheOpening();
        nimzoIndianDefense.playTheOpening();

        System.out.println();

        ChessPiece queen = new ChessPiece("Queen", 9);
        ChessPiece rook = new ChessPiece("Rook", 5);
        ChessPiece knight = new ChessPiece("Knight", 3);
        ChessPiece bishop = new ChessPiece("Bishop", 3);

        ChessPiece[] pieces = {queen, rook, knight, bishop};

        System.out.println("Before: " + Arrays.toString(pieces));
        Arrays.sort(pieces);
        System.out.println("After: " + Arrays.toString(pieces));

    }
}
