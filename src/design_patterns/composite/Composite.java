package design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> components = new ArrayList<>();
    String name;

    public Composite(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public Component getChild(int i){
        return components.get(i);
    }

    @Override
    public void operation() {
        System.out.println("\n" + getName());
        System.out.println("--------------------");

        for (Component component : components) {
            component.operation();
        }
    }

}
