package abstractfactory.pizzasotre.pizza;

public class LDCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪pizza");
        System.out.println("伦敦的奶酪披萨准备原材料");
    }
}
