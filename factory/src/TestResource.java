import java.util.Calendar;

/**
 * 简单工厂： 该类会将创建某一类的行为封装起来（类似提供一个createObject方法），已达到降低俩个类（提供方和适用方）之间的耦合度 （防止某个类（提供方）增加新功能
 * ，另一个（几）类（使用方）需要修改代码 无法满足开闭原则）
 * 即 将某个工厂对象聚合到使用方（需要使用被生产类 的类），到时候增添新功能时只要修改工厂里面的代码即可
 *
 * 抽象工厂： 面向接口（抽象）编程思想，将简单工厂进行再次抽象，到时通过多态传递
 */
public class TestResource {
    public static void main(String[] args) {
        // getInstance 是一个静态方法 Calendar 在这个方法中就类似一个工厂类
        Calendar cal = Calendar.getInstance();
        // 注意月份下标从0开始，所以取月份要+1
        System.out.println("年:" + cal.get(Calendar.YEAR));
        System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:" + cal.get(Calendar.MINUTE));
        System.out.println("秒:" + cal.get(Calendar.SECOND));
    }

}
