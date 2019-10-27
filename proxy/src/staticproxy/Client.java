package staticproxy;

/**
 * 静态代理
 * 即要先要有一个目标对象接口 然后被代理对象（目标对象）和代理对象一起实现里面的方法
 * 将目标对象聚合到代理对象中，然后Client直接通过调用代理对象来间接调用目标对象
 * 缺点：需要实现的代理类特别多
 */
public class Client {
    public static void main(String[] args) {
        //创建被代理对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理对象，并将被代理对象聚合到代理对象里
        TeacherDaOProxy teacherDaOProxy = new TeacherDaOProxy(teacherDao);
        //调用代理对象 先调用代理对象的方法 然后再调用聚合的被代理对象里的方法
        teacherDaOProxy.teach();
    }
}
