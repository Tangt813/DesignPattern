package Template;

public class DolphinPerformance extends BasePerformance {
    //海豚们的表演
    public DolphinPerformance() {
        name = "海豚";
    }
    @Override
    public void perform() {
        System.out.println("海豚饲养员与海豚们表演了水溅跃！");
    }
}
