package cglib;

/**
 * 其实也是动态代理中的一种，利用了拦截器原理
 * 不需要定义一个目标对象接口 可以直接对某个类进行 代理（非Final类）
 * 原理类似dynamic 不过是拦截器实现
 */
public class Client {
    public static void main(String[] args) {
//        创建目标对象
        TeacherDao target = new TeacherDao();
//        获取代理对象 并且目标对象传给工厂
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();

//        底层会出发Intercept方法 从而实现代理的实现
        proxyInstance.teach();

    }
}
