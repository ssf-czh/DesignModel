package abstractfactory.pizzasotre.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("北京的奶酪披萨准备原材料");
    }
}
