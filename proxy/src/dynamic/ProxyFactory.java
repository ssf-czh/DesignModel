package dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
//    维护一个目标对象，Object
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

//    给目标对象生成一个代理对象

    /**
     * public static Object newProxyInstance(ClassLoader loader,
     *                                           Class<?>[] interfaces,
     *                                           InvocationHandler h)
     * Classloader loader： 指定当前目标对象使用的类加载器，获取加载器的方法是固定的
     * Class<?>[] interfaces: 目标对象实现的接口类型 使用泛型的方式确认类型
     * InvocationHandler h: 时间处理， 执行目标对象方法时，触发处理器方法，会将目标对象的方法作为参数传入
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnVal = null;
//                        可以在此判断特定的代理方法
                        if(method.getName() == "teach"){
                            System.out.println("JDK代理开始。。。");

                            System.out.println("开始代理"+method.getName()+"方法");

//                        反射机智调用目标对象的方法
                            returnVal = method.invoke(target, args);

                            System.out.println("JDK代理结束");
                            return returnVal;
                        }
                        return returnVal;


                    }
                });
    }
}
