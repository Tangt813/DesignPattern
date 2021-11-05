package Template;

public class SeaLionPerformance extends BasePerformance {
    //海狮们的表演
    public SeaLionPerformance() {
        name = "海狮";
    }
    @Override
    public void perform(){
        System.out.println("海狮饲养员与海狮们表演了倒立与钻圈圈！");
    }
}
