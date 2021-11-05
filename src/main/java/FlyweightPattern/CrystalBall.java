package FlyweightPattern;

public class CrystalBall extends Ball{
    public int color;
    public int radius;
    //水晶球的商标统一设置为海底狂欢
    public CrystalBall(int radius){
        this.label="海底狂欢！";
        this.radius=radius;
    }
    public String getLabel(){
        return label;
    }
    //根据查阅java控制台底层编码，相应的数字代表着命令行控制台的颜色
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
    //得到半径
    public int getRadius(){
        return radius;
    }
    //设置半径
    public void setRadius(int r){
        radius=r;
    }
    //设置颜色，根据控制台输入的信息，来判断颜色数值的编码，进而返回相应控制台数字
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
    //设置水晶球所刻的纪念名称
    public void setName(String name){
        this.name=name;
    }

    //通过自己的设计，将该水晶球打印出来
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
            // \33[+数字+m 是java控制台修改底色的标准格式代码
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
    //场景里面纪念品商店，通过按帧播放的操作，实现3D打印的效果
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
            //java里面实现时间停顿的方法，sleep里面的数字表示在此刻停顿多少毫秒
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
                    //java里面实现时间停顿的方法，sleep里面的数字表示在此刻停顿多少毫秒
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
                    //java里面实现时间停顿的方法，sleep里面的数字表示在此刻停顿多少毫秒
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
