public class DvDPlayer {
//    使用单例模式
//    饿汉式
    private static DvDPlayer instance = new DvDPlayer();
    public static DvDPlayer getInstance(){
        return instance;
    }

    private DvDPlayer(){
    }

    public void on(){
        System.out.println("DvD on");
    }
    public void off(){
        System.out.println("DvD off");
    }
    public void play(){
        System.out.println("DvD is playing");
    }
    public void pause(){
        System.out.println("DvD pause...");
    }
}
