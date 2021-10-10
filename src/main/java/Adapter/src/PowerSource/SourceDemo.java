package PowerSource;

import SourceInterface.ElectricitySource;

/**
 * Demo
 * 不管传入什么参数，Electricity类的Ec都可以适配
 * using electricity successfully!
 * using electricity by changing Solar
 * Use solar source successfully! The voltage changes from 100V to 220V
 * using electricity by changing Wind
 * Use wind source successfully! The voltage changes from 120V to 220V
 */
public class SourceDemo  {

    public static void main(String[] args) {
        Electricity Ec=new Electricity();
        Ec.electircityPlay("");
        Ec.electircityPlay("Solar");
        Ec.electircityPlay("Wind");

    }

}
