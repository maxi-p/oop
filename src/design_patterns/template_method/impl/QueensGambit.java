package design_patterns.template_method.impl;

import design_patterns.template_method.QueenPawnOpening;

public class QueensGambit extends QueenPawnOpening {
    public QueensGambit() {
        name = "Queen's Gambit";
    }

    public void blackMove1() {
        System.out.print("d5 ");
    }

    public void blackMove2() {

    }

    public void hook() {
        System.out.println();
    }
}
