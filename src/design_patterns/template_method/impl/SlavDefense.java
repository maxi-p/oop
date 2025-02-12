package design_patterns.template_method.impl;

import design_patterns.template_method.QueenPawnOpening;

public class SlavDefense extends QueenPawnOpening {
    public SlavDefense() {
        name = "Slav Defense";
    }
    
    public void blackMove1() {
        System.out.print("d5 ");
    }

    public void blackMove2() {
        System.out.println("c6 ");
    }
}
