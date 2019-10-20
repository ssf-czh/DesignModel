package abstractfactory.pizzasotre.order;

import abstractfactory.pizzasotre.pizza.BJCheesePizza;
import abstractfactory.pizzasotre.pizza.BJPepperPizza;
import abstractfactory.pizzasotre.pizza.Pizza;

//这是一个抽象工厂的子类
public class BJFactory extends AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
