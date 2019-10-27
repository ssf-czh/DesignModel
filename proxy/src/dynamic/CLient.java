package dynamic;

/**
 * 动态代理：（JDK代理或者接口代理）
 * 首先有一个目标对象接口，然后目标对象实现它，但是代理对象并不用实现它
 * 通过java.lang.reflect.Proxy下的Proxy.newProxyInstance方法直接动态的在内存时直接获得代理对象
 */
public class CLient {
    public static void main(String[] args) {
//        创建一个目标对象
        ITeacherDao teacherDao = new TeacherDao();

//        给目标对象创建代理对象，先new工厂类 需要强转成目标对象所实现的接口
//        Object proxyInstance = new ProxyFactory(teacherDao).getProxyInstance();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();

        proxyInstance.sayHello("czh");
    }
}
