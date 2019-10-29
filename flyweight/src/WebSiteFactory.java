import java.util.HashMap;

//网站工厂类，根据需求返回一个具体的网站
public class WebSiteFactory {
//    集合 充当池的作用
     private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

     //根据网站的类型返回一个网站 如果没有就创建一个网站并放入到池中
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    //获取网站分类的总数
    public int getWebsiteCount(){
        return pool.size();
    }
}
