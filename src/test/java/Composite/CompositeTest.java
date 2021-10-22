package Composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void testComposite(){
        Composite root = new Composite("海底世界总园区");
        root.add(new Leaf("售票处"));
        root.add(new Leaf("小吃部"));
        root.add(new Leaf("安全部"));

        Composite castle = new Composite("海底世界城堡区");
        root.add(castle);
        castle.add(new Leaf("售票处"));
        castle.add(new Leaf("小吃部"));
        castle.add(new Leaf("安全部"));

        Composite garden = new Composite("海底世界花园区");
        root.add(garden);
        garden.add(new Leaf("售票处"));
        garden.add(new Leaf("小吃部"));
        garden.add(new Leaf("安全部"));

        Composite raceProject = new Composite("海底世界竞速项目");
        garden.add(raceProject);
        raceProject.add(new Leaf("小吃部"));

        System.out.println("以下打印海底世界游乐园某些部门的树形结构\n");
        root.display(0);
    }
}
