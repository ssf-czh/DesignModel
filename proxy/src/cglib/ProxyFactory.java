package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    // 维护一个目标对象
    private Object target;

//    传入被代理对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

//    返回一个代理对象 (target 的代理对象)
    public Object getProxyInstance(){
//        1创建一个工具类
        Enhancer enhancer = new Enhancer();
//        2设置父类
        enhancer.setSuperclass(target.getClass());
//        3设置回调函数
        enhancer.setCallback(this);
//        4创建子类对象 即代理对象
        return enhancer.create();
    }

//    重写intercept返回，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式开始...");
        Object resultVal = method.invoke(target, objects);
        System.out.println("Cglib代理结束..");
        return resultVal;
    }
}
