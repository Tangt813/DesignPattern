package Composite;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    //向当前组件添加子组件
    public abstract void add(Component component);

    //移除当前组件的子组件
    public abstract void remove(Component component);

    //展示以当前组件为根节点的目录树结构
    public abstract void display(int depth);

}