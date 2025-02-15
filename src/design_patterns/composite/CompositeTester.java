package design_patterns.composite;

public class CompositeTester {
    public static void main(String[] args) {
        Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        Component leaf3 = new Leaf();

        Component composite = new Composite("Sub Items");

        Component leaf4 = new Leaf();
        Component leaf5 = new Leaf();
        Component leaf6 = new Leaf();
        Component leaf7  = new Leaf();

        composite.add(leaf4);
        composite.add(leaf5);
        composite.add(leaf6);
        composite.add(leaf7);

        Component root = new Composite("Root");

        root.add(leaf1);
        root.add(leaf2);
        root.add(leaf3);
        root.add(composite);

        root.operation();
    }
}
