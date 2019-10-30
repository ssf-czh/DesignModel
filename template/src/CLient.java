/**
 * 比较简单的设计模式
 * 相当于定义一个抽象类
 * 里面有许多方法 包含一个解决问题的主方法（调用其他方法）模板
 * 子类重写这些被调用的方法
 *
 */
public class CLient {
    public static void main(String[] args) {
//        制作红豆豆浆
        System.out.println("----制作红豆豆浆----");
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

//        制作花生豆浆
        System.out.println("----制作花生豆浆----");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

    }
}
