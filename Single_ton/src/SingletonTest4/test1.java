package SingletonTest4;

public class test1 {
    public static void main(String[] args) {
        System.out.println("懒汉式2，线程安全--");
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//懒汉式(改造成线程安全，同步方法)

/**
 * 优点：起到了懒加载的作用 解决了线程不安全问题
 * 缺点：方法进行同步 效率太低
 * 结论：实际开发中 不建议使用
 */
class SingleTon{
    private static SingleTon instance;
    private SingleTon(){}

    //提供一个静态方法，当使用该方法时，才创建instance
    //懒汉式 加入了同步处理的代码，解决了线程安全问题
    public static synchronized SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }
}
