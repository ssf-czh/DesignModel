package SingletonTest03;

public class test1 {
    public static void main(String[] args) {
        System.out.println("懒汉式1，线程不安全--");
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//懒汉式

/**
 * 优点：起到了懒加载的作用
 * 缺点：线程不安全 在多线程中不可使用
 * 结论：实际开发中 不建议使用 
 */
class SingleTon{
    private static SingleTon instance;
    private SingleTon(){}

    //提供一个静态方法，当使用该方法时，才创建instance
    //懒汉式
    public static SingleTon getInstance(){
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }
}
