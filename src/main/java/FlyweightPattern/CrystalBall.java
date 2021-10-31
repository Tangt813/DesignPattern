package FlyweightPattern;

public class CrystalBall extends Ball{
    public int color;
    public int radius;
    public CrystalBall(int radius){
        this.label="海底狂欢！";
        this.radius=radius;
    }
    public String getLabel(){
        return label;
    }
    public String getColor(){
        if(this.color==91){
            return "red";
        }
        else if(this.color==0){
            return "white";
        }
        else if(this.color==94){
            return "blue";
        }
        else if(this.color==96){
            return "green";
        }
        else if(this.color==93){
            return "yellow";
        }
        return "none";
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
    public void setColor(String color){
        if(color.equalsIgnoreCase("red")){
            this.color=91;
        }
        else if(color.equalsIgnoreCase("white")){
            this.color=0;
        }
        else if(color.equalsIgnoreCase("blue")){
            this.color=94;
        }
        else if(color.equalsIgnoreCase("yellow")){
            this.color=93;
        }
        else if(color.equalsIgnoreCase("green")){
            this.color=96;
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public void draw(String m){
        int r=this.radius;
        int R=2*r;
        int numColor=this.color;
        for(int i = 0;i <= R;i+=2) {
            int y;
            if(i <= r)	y = r-i;
            else y = i-r;
            double len =  Math.round(Math.sqrt(r*r - y*y));
            for(int j = 0;j < r-len;j++)	System.out.print(" ");
            System.out.format("\33[%dm%s",numColor,m);
            for(int j = 0;j < 2*len;j++){
                if(i%r==(r-2)&&i<(R-2)&&j==len-4){
                    String name=String.format("%-6s","海底狂欢！");
                    j=(int)len+5;
                    System.out.format("\33[%dm%s ",numColor,name);
                }
                else if(i%r==0&&i%R!=0&&j==len-3){
                    String name=String.format("%-6s","Ameis ");
                    j=(int)len+2;
                    System.out.format("\33[%dm%s",numColor,name);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(m);
        }
        System.out.println("\33[0m");
    }

    public void draw1(String m){
        int r=this.radius;
        int R=2*r;
        int numColor=this.color;
        for(int i = 0;i <= R;i+=2) {
            int y;
            if(i <= r)	y = r-i;
            else y = i-r;
            double len =  Math.round(Math.sqrt(r*r - y*y));
            for(int j = 0;j < r-len;j++){
                System.out.print(" ");
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.format("\33[%dm%s",numColor,m);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int j = 0;j < 2*len;j++){
                if(i%r==(r-2)&&i<(R-2)&&j==len-4){
                    String name=String.format("%-6s","海底狂欢！");
                    j=(int)len+5;
                    System.out.format("\33[%dm%s ",numColor,name);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else if(i%r==0&&i%R!=0&&j==len-3){
                    String name=String.format("%-6s","Ameis ");
                    j=(int)len+2;
                    System.out.format("\33[%dm%s",numColor,name);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    System.out.print(" ");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(m);
        }
        System.out.println("\33[0m");
    }
}
