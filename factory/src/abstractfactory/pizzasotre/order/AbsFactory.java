package abstractfactory.pizzasotre.order;


import abstractfactory.pizzasotre.pizza.Pizza;

//这是抽象工厂模式的 抽象层
public abstract class AbsFactory {

    // 让其具体的子类来实现
    public abstract Pizza createPizza(String orderType);
}
