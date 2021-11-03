package Template;

public abstract class BasePerformance {

    public void performProcess() {
        System.out.println("表演者开始候场");
        System.out.println("表演者登上舞台");
        System.out.println("表演者向观众致意");
        perform();
        System.out.println("表演完毕，表演者再次向观众致意");
        System.out.println("表演者退场");
    }

    public abstract void perform();
}
