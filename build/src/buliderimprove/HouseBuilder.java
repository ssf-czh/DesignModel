package buliderimprove;

//抽象的建者
public abstract class HouseBuilder {
    protected House house = new House();

    //抽象方法

    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    //建房
    public House buildHouse(){
        return house;
    }
}
