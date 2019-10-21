package classadapter;

//适配器类

/**
 * 类适配器 只能继承一个类 所以有一定的局限性
 * 且被适配类的方法被暴露
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
//        获取到220V电压
        int srcV = output220V();
        int dstV = srcV / 44;
        System.out.println("通过适配器以转换成5V");
        return dstV;
    }
}
