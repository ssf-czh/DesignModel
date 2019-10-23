//这里是抽象的修饰类
public abstract class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink; //被装饰者
    }

    @Override
    public float cost() {
//        这里的getPrice是后面继承此类时赋予的装饰者price
        return getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
//        这里的des是后面继承此类（装饰者） 所赋予的des
        return des + " " + getPrice() + " && " + drink.getDes();
    }
}
