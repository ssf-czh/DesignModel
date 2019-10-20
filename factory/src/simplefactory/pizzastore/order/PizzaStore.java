package simplefactory.pizzastore.order;

import simplefactory.pizzastore.order.OrderPizza;

//相当于客户端，发出订购
public class PizzaStore {
    public static void main(String[] args) {
//        new OrderPizza();

//        使用简单工厂模式
        new OrderPizza(new SimpleFactory());

    }
}
