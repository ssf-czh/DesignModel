package SingletonTest05;

public class test1 {
    public static void main(String[] args) {
        System.out.println("双重检查，线程安全--");
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance1 = SingleTon.getInstance();
        System.out.println(instance == instance1); //true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

//双重检查

/**
 * 优点：起到了懒加载的作用 解决了线程不安全问题，效率高
 * 结论：实际开发中 推荐使用
 */
class SingleTon{
    private static volatile SingleTon instance;
    private SingleTon(){}

    //提供一个静态方法，当使用该方法时，才创建instance
//    加入双重检查代码 解决线程安全问题，进行懒加载
    public static  SingleTon getInstance(){
        if(instance == null){
            synchronized (SingleTon.class){
                if(instance == null){
                    instance = new SingleTon();
                }
            }
        }

//        注意这种写法是错误的 一定会执行2次 只是先后问题
//        if(instance == null){
//            synchronized (SingleTon.class){
//                    instance = new SingleTon();
//            }
//        }
        return instance;
    }
}
