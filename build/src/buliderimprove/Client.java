package buliderimprove;

public class Client {
    public static void main(String[] args) {
        //普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //返回房子
        House house = houseDirector.constructHouse();

        System.out.println(house);

//        -----------------
        //高楼
        HighBuliding highBuliding = new HighBuliding();
        //准备指挥者
        HouseDirector houseDirector1 = new HouseDirector(highBuliding);

        //返回房子
        House house1 = houseDirector1.constructHouse();

        System.out.println(house1);
    }
}
