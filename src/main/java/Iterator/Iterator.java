package Iterator;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Iterator.java
 * @Description 迭代器接口
 * @createTime 2021年10月17日 12:58:00
 */
public interface Iterator {

    public abstract Object first();

    public abstract boolean hasNext();

    public abstract Object next();

    public Iterator begin();

}
