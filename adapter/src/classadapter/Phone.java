package classadapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("可以充电");
        }else{
            System.out.println("不可充电");
        }
    }
}
