
//享元模式

/**
 * 即共享对象模式   String 和池技术都用到了享元模式
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
//        客户要一个新闻发布形式的网站
        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻发布");
//        webSite.use();
        webSite.use(new User("Tom"));

//        客户要一个博客发布形式的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("博客发布");
//        webSite1.use();
        webSite.use(new User("jack"));
        //        客户要一个博客发布形式的网站
        WebSite webSite2= webSiteFactory.getWebSiteCategory("博客发布");
//        webSite2.use();
        webSite.use(new User("smith"));
//        客户要一个博客发布形式的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客发布");
//        webSite3.use();
        webSite.use(new User("king"));

        System.out.println(webSiteFactory.getWebsiteCount());
    }
}
