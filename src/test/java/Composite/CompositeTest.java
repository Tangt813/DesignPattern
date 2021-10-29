package Composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void testComposite(){
        Composite root = new Composite("海底世界总园区");
        root.add(new Leaf("售票处"));
        root.add(new Leaf("餐厅"));
        root.add(new Leaf("安保部"));

        Composite castle = new Composite("海底世界城堡区");
        root.add(castle);
        castle.add(new Leaf("售票处"));
        castle.add(new Leaf("餐厅"));
        castle.add(new Leaf("安保部"));

        Composite garden = new Composite("海底世界花园区");
        root.add(garden);
        garden.add(new Leaf("售票处"));
        garden.add(new Leaf("餐厅"));
        garden.add(new Leaf("安保部"));

        Composite raceProject = new Composite("海底世界过山车");
        garden.add(raceProject);
        raceProject.add(new Leaf("过山车餐厅"));
        System.out.println("# 组合模式(Composite Pattern),又叫部分整体模式,是用于把一组相似的对象当作一个单一的对象.    \n" +
                           "# 组合模式依据树形结构来组合对象,用来表示部分以及整体层次.                                \n" +
                           "# 这种模式创建了一个包含自己对象组的类,该类提供了修改相同对象组的方式.                      \n");
        System.out.println("# 在海底世界狂欢节中,各个部门与园区之间便隶属于这种‘整体’与‘部分’层次,以下我们将海底世界狂欢节的组织结构打印出来");
        root.display(0);
        System.out.println("\n# 除此之外,组合模式的应用场景还有很多:");
        System.out.println("# 例如在纪念品商店中我们可以先创建一个虚类Object用来表示售卖的物品");
        System.out.println("# 水晶球,玩偶这些商品可以继承自Object,而商店售卖的玩具礼包等物品也是继承自Object,而玩具礼包中又包含这些商品,这就表示了'整体'与'部分的关系'");
    }
}
