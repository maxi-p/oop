package design_patterns.strategy;

public class BishopMove implements MovingBehavior{
    @Override
    public void print(){
        System.out.println("Diagonal move");
    }
}
