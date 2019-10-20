package SIngletonTest07;

public class test1 {
    public static void main(String[] args) {
        System.out.println("利用枚举完成单例模式，线程安全--");
        SingleTon instance = SingleTon.INSTANCE;
        SingleTon instance1 = SingleTon.INSTANCE;
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//静态内部类完成单例
//类加载是线程安全的

/**
 * 优点：起到了懒加载的作用 线程安全 效率高 防止返序列化生成新的对象
 * 结论：实际开发中 推荐使用
 */
enum SingleTon{
    INSTANCE
    ;
    public void sayOK(){
        System.out.println();
    }
}