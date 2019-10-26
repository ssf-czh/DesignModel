//外观类
public class HomeTheaterFacade {
//    定义各个子系统的对象
    private TheaterLight theaterLight;
    private PopCorn popCorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DvDPlayer dvDPlayer;

    public HomeTheaterFacade(){
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvDPlayer = DvDPlayer.getInstance();
    }

//    操作分成4个步骤
    public void ready(){
        popCorn.on();
        popCorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvDPlayer.on();
        theaterLight.dim();

    }

    public void play(){
        dvDPlayer.play();
    }
    public void pause(){
        dvDPlayer.pause();
    }
    public void end(){
        popCorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvDPlayer.off();
    }
}
