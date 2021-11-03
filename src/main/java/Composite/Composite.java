package Composite;

import java.util.ArrayList;

public class Composite extends Component {

    public Composite(String name) {
        super(name);
    }

    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    //向当前组件添加子组件
    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    //移除当前组件的子组件
    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    //展示以当前组件为根节点的目录树结构
    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++) {
            System.out.print("——");
        }
        System.out.println(name);

        for (Component component : componentArrayList) {
            component.display(depth + 1);
        }
    }

}
