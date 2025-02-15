package design_patterns.composite;

public class Leaf extends Component{
    private static int count = 0;
    private final int id;

    public Leaf() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    @Override
    public void operation() {
        System.out.println("Leaf #" + id);
    }

}
