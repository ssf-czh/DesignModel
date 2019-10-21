package bulider;

public abstract class AbstractHouse {

    //打地基
    public abstract void bulidBasic();

    //砌墙
    public abstract void bulidWalls();

    //封顶
    public abstract void roofed();

    public void build(){
        bulidBasic();
        bulidWalls();
        roofed();
    }

}
