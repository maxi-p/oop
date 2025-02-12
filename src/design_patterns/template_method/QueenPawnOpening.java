package design_patterns.template_method;

public abstract class QueenPawnOpening {
    public String name;

    public void printName() {
        System.out.print(name + ": ");
    }

    public void whiteMove1() {
        System.out.print("1. d4 ");
    }

    public abstract void blackMove1();

    public void whiteMove2() {
        System.out.print("2. c4 ");
    }

    public abstract void blackMove2();

    public void playTheOpening() {
        printName();
        whiteMove1();
        blackMove1();
        whiteMove2();
        blackMove2();
        hook();
    }

    public void hook() {

    }
}
