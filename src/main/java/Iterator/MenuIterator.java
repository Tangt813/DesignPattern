package Iterator;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName MenuIterator.java
 * @Description 菜单中的迭代器
 * @createTime 2021年10月17日 13:17:00
 */
public class MenuIterator implements Iterator {

    private final Menu menu;
    private int index;

    public MenuIterator(Menu menu){
        this.menu = menu;
        this.index = 0;
    }

    @Override
    public Object first() {
        Dish dish = menu.getDishAt(0);
        index = 0;
        return dish;
    }

    public boolean hasNext() {
        return index < menu.getLength();
    }

    public Object next() {
        Dish dish = menu.getDishAt(index);
        index++;
        return dish;
    }
}
