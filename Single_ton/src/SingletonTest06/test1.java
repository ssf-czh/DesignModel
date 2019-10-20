package SingletonTest06;

public class test1 {
    public static void main(String[] args) {
        System.out.println("静态内部类完成单例模式，线程安全--");
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//静态内部类完成单例
//类加载是线程安全的
/**
 * 优点：起到了懒加载的作用 线程安全 效率高
 * 结论：实际开发中 推荐使用
 */
class SingleTon{
    private static SingleTon instance;
    private SingleTon(){}

//    写一个静态内部类，该类中有一个静态属性
    private static class SingletonInstance{
        private static final SingleTon INSTANCE = new SingleTon();
    }


//    提供一个静态共有方法，直接返回INSTANCE
    //利用静态内部类 加载时候的线程安全（JVM保证）来保证线程安全与懒加载（使用到才加载）
    public static synchronized SingleTon getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
