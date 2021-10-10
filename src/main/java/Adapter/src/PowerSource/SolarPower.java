package PowerSource;

import SourceInterface.EnvironmentPowerSource;

/**
 * 太阳能
 */
public class SolarPower implements EnvironmentPowerSource {
    String name;
    int voltage;
    public SolarPower(int voltage)
    {
        name="Solar";
        this.voltage=voltage;
    }
    @Override
    public void windPlay()
    {

    }
    @Override
    public void solarPlay()
    {
        System.out.println("Use solar source successfully! The voltage changes from "+voltage+"V to 220V");
    }
}
