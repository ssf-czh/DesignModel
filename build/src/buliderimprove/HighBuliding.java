package buliderimprove;

public class HighBuliding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼房子打地基100m");
        house.setBaise("100m");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼房子砌墙20cm");
        house.setWall("20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼房子盖屋顶");
        System.out.println("ok");
    }
}
