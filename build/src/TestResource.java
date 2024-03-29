/**
 * 建造者模式有4个角色 分别是 产品 抽象建造者 具体实现建造者（子类） 指挥者
 * 产品：建造出来的目标对象
 * 抽象建造者: 抽象的一类接口或者抽象类 其中定义组合了目标对象，拥有若干个抽象方法，还有一个返回值为产品的方法getResult(){ return Product;}
 * 具体实现建造者： 具体实现了抽象建造者的方法
 * 指挥者： 聚合了抽象建造者（接口/抽象类 易扩展） 将建造者里的方法组合 得到最终产品 利用抽象建造者的getResult 方法获得产品
 *
 *
 * 建造者模式与抽象工厂模式的比较:
 * 与抽象工厂模式相比， 建造者模式返回一个组装好的完整产品 ，而抽象工厂模式返回一系列相关的产品，这些产品位于不同的产品等级结构，构成了一个产品族。
 * 在抽象工厂模式中，客户端实例化工厂类，然后调用工厂方法获取所需产品对象，而在建造者模式中，客户端可以不直接调用建造者的相关方法，而是通过指挥者类来指导如何生成对象，包括对象的组装过程和建造步骤，它侧重于一步步构造一个复杂对象，返回一个完整的对象。
 * 如果将抽象工厂模式看成汽车配件生产工厂 ，生产一个产品族的产品，那么建造者模式就是一个汽车组装工厂 ，通过对部件的组装可以返回一辆完整的汽车。
 *
 */
public class TestResource {
    public static void main(String[] args) {

        //在StringBuilder中，Append接口是作为抽象建造者，定义了抽象方法
        // 而AbstractStringBuilder已经是建造者了，只是不能实例化
        //StringBuilder 既是建造者，又是指挥者
        StringBuilder czh = new StringBuilder("czh");
        System.out.println(czh);
    }
}
