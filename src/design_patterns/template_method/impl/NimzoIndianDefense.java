package design_patterns.template_method.impl;

import design_patterns.template_method.QueenPawnOpening;

public class NimzoIndianDefense extends QueenPawnOpening {
    public NimzoIndianDefense() {
        name = "Nimzo-Indian Defense";
    }

    public void blackMove1() {
        System.out.print("Nf6 ");
    }

    public void blackMove2() {
        System.out.print("e6 ");
    }

    public void whiteMove3() {
        System.out.print("3. Nf3 ");
    }

    public void blackMove3() {
        System.out.println("Bb4 ");
    }

    @Override
    public void hook() {
        whiteMove3();
        blackMove3();
    }
}
