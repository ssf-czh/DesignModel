//这里是具体的修饰类
public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        //装饰者的描述
        setDes("巧克力");
        //装饰者的价格
        setPrice(3.0f);
    }

}
