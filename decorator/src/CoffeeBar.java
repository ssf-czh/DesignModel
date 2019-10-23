public class CoffeeBar {
    public static void main(String[] args) {
        //    点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("描述订单1 "+order.getDes());
        System.out.println("价格订单1 "+order.cost());
        System.out.println("==================================");
        //  再加一分牛奶
        order = new Milk(order);
        System.out.println("描述订单2 "+order.getDes());
        System.out.println("价格订单2 "+order.cost());
        System.out.println("==================================");
        // 再加一分牛奶
        order = new Milk(order);
        System.out.println("描述订单3 "+order.getDes());
        System.out.println("价格订单3 "+order.cost());
        System.out.println("==================================");
        // 再加一分牛奶
        order = new Chocolate(order);
        System.out.println("描述订单4 "+order.getDes());
        System.out.println("价格订单4 "+order.cost());
    }
}
