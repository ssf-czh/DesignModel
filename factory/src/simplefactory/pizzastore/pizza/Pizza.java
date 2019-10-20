package simplefactory.pizzastore.pizza;

//将Pizza作为抽象类
public abstract class Pizza {
    protected String name;

//    准备原材料,不同的pizza原材料不一样，因此做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }
    public void cut() {
        System.out.println(name + " cutting;");
    }
    public void box() {
        System.out.println(name + " boxing;");
    }
    public void setName(String name) {
        this.name = name;
    }
}
