package SingletonTest01;

public class test1 {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//饿汉式(静态变量)

/**
 * 优点：在类加载的时候就完成了实例化，不会出现线程同步的问题
 * 缺点：在类加载的时候就完成了实例化，没有达到 懒加载的效果，如果不用这个对象的话，就会造成内存浪费
 * 结论：该单例模式可用，但可能造成内存浪费
 */
class SingleTon{
//    1构造器私有化 外部就不能new
    private SingleTon(){
    }

//    2在本地创建一个对象实例
    private final static SingleTon instance = new SingleTon();

//   3 提供一个静态方法，返回实例对象
    public static SingleTon getInstance(){
        return instance;
    }
}
