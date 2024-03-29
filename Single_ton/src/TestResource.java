public class TestResource {


    /**
     * 总结：
     * Test01：饿汉式：定义一个静态成员变量，类加载的时候通过new()来创建   --->线程安全，但是非懒加载->如不不用则浪费内存 ，看条件使用
     * Test02: 饿汉式（静态代码块）->类似Test01
     * Test03：懒汉式： 在使用的时候才通过isnull来判断是否创建对象  --->懒加载 ，但是线程不安全（没有使用（在方法上）同步代码块，同时进入isnull判断块里）,不推荐使用
     * Test04：懒汉式：同03，但是在方法上使用了synchronized关键字 --->懒加载，线程安全，但是效率变慢(因为多线程的话没次用次方法都要判断是否同步),不推荐使用
     * Test05: 双重检查：在方法体内使用了synchronized关键字，利用2个if来确保一定不会被重复创建 --->懒加载，线程安全，推荐使用
     * Test06: 静态内部类： 在类中定义一个静态内部类，在需要使用单例的时候通过静态内部类加载（JVM底层保证了类加载只会一次，而且线程安全）创建单例 -->懒加载，线程安全，推荐使用
     * Test07: 枚举：天生单例 推荐使用
     * @param args
     */
    public static void main(String[] args) {
        Runtime.getRuntime();
    }
}
