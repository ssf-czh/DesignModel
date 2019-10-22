public class CLient {
    public static void main(String[] args) {
//        通过实现层和抽象层达到可维护性的特点 类似通过组合 2 * 2    *通过抽象层中的组合体现出来
        // 获取折叠式手机 （样式＋品牌）
        Phone phone1 = new FolderPhone(new Xiaomi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("=========================");

        Phone phone2 = new FolderPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("=========================");
        Phone phone3 = new UpRightPhone(new Xiaomi());
        phone3.open();
        phone3.call();
        phone3.close();
    }
}
