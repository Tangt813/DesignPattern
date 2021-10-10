package PowerSource;

import SourceInterface.ElectricitySource;

/**
 * 电能
 */
public class Electricity implements ElectricitySource {
    ElectrcityAdapter EA;

    /**
     * 根据传入的type适配不同接口
     * @param type：能量形式参数
     */
    @Override
    public void electircityPlay(String type)
    {
        //无参代表就是电能
        if(type=="")
        {
            System.out.println("using electricity successfully!");
        }
        //风能或太阳能
        else if(type=="Solar"||type=="Wind")
        {
            if(type=="Solar")
            {
                EA=new ElectrcityAdapter("Solar");
                System.out.println("using electricity by changing "+type);
                EA.electircityPlay(type);
            }
            else if(type=="Wind")
            {
                EA=new ElectrcityAdapter("Wind");
                System.out.println("using electricity by changing "+type);
                EA.electircityPlay(type);
            }
        }

    }
}
