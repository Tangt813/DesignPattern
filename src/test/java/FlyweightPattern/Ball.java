package FlyweightPattern;

public abstract class Ball {
    public String label;
    public String color;
    public int radius;
    public String name;
    public abstract String getColor();
    public abstract int getRadius();
    public abstract void draw(String m);
    public abstract void setRadius(int r);
}
