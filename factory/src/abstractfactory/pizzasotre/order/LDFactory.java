package abstractfactory.pizzasotre.order;

import abstractfactory.pizzasotre.pizza.*;
import simplefactory.pizzastore.pizza.CheesePizza;

//这是一个抽象工厂的子类
public class LDFactory extends AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
