package FlyweightPattern;

public class CrystalBall extends Ball{
    public String color;
    public int radius;
    public CrystalBall(int radius){
        this.label="海底狂欢！";
        this.radius=radius;
    }
    public String getLabel(){
        return label;
    }
    public String getColor(){
        return color;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setName(String name){
        this.name=name;
    }
    public void draw(String m){
        int r=this.radius;
        int R=2*r;
        for(int i = 0;i <= R;i+=2) {
            int y;
            if(i <= r)	y = r-i;
            else y = i-r;
            double len =  Math.round(Math.sqrt(r*r - y*y));
            for(int j = 0;j < r-len;j++)	System.out.print(" ");
            System.out.print(m);
            for(int j = 0;j < 2*len;j++){
                if(i%r==(r-2)&&i<(R-2)&&j==len-4){
                    String name=String.format("%-6s","海底狂欢！");
                    j=(int)len+5;
                    System.out.print(name+" ");
                }
                else if(i%r==0&&i%R!=0&&j==len-3){
                    String name=String.format("%-6s","Ameis ");
                    j=(int)len+2;
                    System.out.print(name);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(m);
        }
    }
}
