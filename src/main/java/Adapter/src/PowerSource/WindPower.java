package PowerSource;

import SourceInterface.EnvironmentPowerSource;

/**
 * 风能
 */
public class WindPower implements EnvironmentPowerSource {
    String name;
    int voltage;
    public WindPower(int voltage)
    {
        name="Wind";
        this.voltage=voltage;
    }
    @Override
    public void windPlay()
    {
        System.out.println("Use wind source successfully! The voltage changes from "+voltage+"V to 220V");
    }
    @Override
    public void solarPlay()
    {
    }
}
