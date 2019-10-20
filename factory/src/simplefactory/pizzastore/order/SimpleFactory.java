package simplefactory.pizzastore.order;

import simplefactory.pizzastore.pizza.CheesePizza;
import simplefactory.pizzastore.pizza.GreekPizza;
import simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据orderType返回pizza对象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        return pizza;
    }
}
