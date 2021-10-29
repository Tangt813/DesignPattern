package Adapter;

/**
 * author:XIE YUXIANG
 */
public class RegularAdapter extends VIP{
    //适配器类
    private Regular regular;
    public RegularAdapter(Regular regular)
    {
        this.regular=regular;
    }
    public RegularAdapter()
    {
        this.regular=new Regular();
    }
    @Override
    public void getPay()
    {
        //调用普通用户的函数
        regular.getPay();
    }
}
