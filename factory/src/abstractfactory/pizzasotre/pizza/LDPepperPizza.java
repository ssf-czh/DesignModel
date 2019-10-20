package abstractfactory.pizzasotre.pizza;

public class LDPepperPizza extends Pizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦的胡椒披萨准备原材料");
    }
}
