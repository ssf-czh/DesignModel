/**
 * 外观模式
 * 主要是将几个子模块组合或者聚合在外观类中
 * 然后将功能进行模块化，利用所依赖的子模块对象进行方法的组合调用，提高各个模块的复用性
 */
public class Client {
    public static void main(String[] args) {
        //直接调用很麻烦 扩张不方便 要做个外观类
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
//        homeTheaterFacade.pause();
        homeTheaterFacade.end();

    }
}
