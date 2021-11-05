package Composite;

public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    //向当前组件添加子组件
    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    //移除当前组件的子组件
    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    //展示以当前组件为根节点的目录树结构
    @Override
    public void display(int depth) {
        for(int i=0; i<depth; i++) {
            System.out.print("——");
        }
        System.out.println(name);
    }
}
