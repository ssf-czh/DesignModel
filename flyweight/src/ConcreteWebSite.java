public class ConcreteWebSite extends WebSite {
    private String type = "";//网站的类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

//    @Override
//    public void use() {
//        System.out.println("网站的发布形式为：" + type);
//    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + "...  使用者为" + user.getName());
    }
}
