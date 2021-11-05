package FlyweightPattern;

public abstract class Ball {
    public String label;
    public String color;
    public int radius;
    public String name;
    public abstract String getColor();//得到颜色
    public abstract int getRadius();//得到半径
    public abstract void draw(String m);//画出水晶球
    public abstract void setRadius(int r);//设置半径
}
