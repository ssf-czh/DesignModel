public class Client {
    public static void main(String[] args) throws Exception {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("jack",2,"黑色"));
//        传统方法
//        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
//        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        Sheep sheep2 = (Sheep) sheep.clone();//克隆
        Sheep sheep3 = (Sheep) sheep.clone();//克隆
        Sheep sheep4 = (Sheep) sheep.clone();//克隆
        Sheep sheep5 = (Sheep) sheep.clone();//克隆
        Sheep sheep6 = (Sheep) sheep.clone();//克隆
        Sheep sheep7 = (Sheep) sheep.clone();//克隆


        System.out.println(sheep2.getFriend().hashCode());
        System.out.println(sheep3.getFriend().hashCode());

    }
}
