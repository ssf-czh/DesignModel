package objectadapter;

//适配器类


/**
 * 对象适配器 相比类适配器更加常用
 */
public class VoltageAdapter implements IVoltage5V {
//    聚合关系
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
//        获取到220V电压
        int dstV = 0;
        if(voltage220V != null){
            int srcV = voltage220V.output220V();
            dstV = srcV / 44;
            System.out.println("通过适配器以转换成5V");
        }
        return dstV;
    }
}
