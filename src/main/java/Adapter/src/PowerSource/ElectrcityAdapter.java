package PowerSource;

import SourceInterface.ElectricitySource;
import SourceInterface.EnvironmentPowerSource;

/**
 * 电能适配器，将风能和太阳能的能量转换为电能
 */
public class ElectrcityAdapter implements ElectricitySource {
    EnvironmentPowerSource eps;
    ElectrcityAdapter(String powerName)
    {
        if(powerName=="Solar")
        {
            eps=new SolarPower(100);
        }
        else if(powerName=="Wind")
        {
            eps=new WindPower(120);
        }
    }
    @Override
    public void electircityPlay(String type)
    {
        if(type=="Solar")
        {
            eps.solarPlay();
        }
        else if(type=="Wind")
        {
            eps.windPlay();
        }
    }
}
