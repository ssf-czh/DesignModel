package buliderimprove;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5m");
        house.setBaise("5m");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙10cm");
        house.setWall("10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");
        house.setRoofed("ok");
    }
}
