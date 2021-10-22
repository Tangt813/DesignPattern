package Composite;

import java.util.ArrayList;

public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);

        for (Component component : componentArrayList) {
            component.display(depth + 1);
        }
    }

}
