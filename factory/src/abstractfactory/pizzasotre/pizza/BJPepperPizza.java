package abstractfactory.pizzasotre.pizza;

public class BJPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京胡椒pizza");
        System.out.println("北京的胡椒披萨准备原材料");
    }
}
