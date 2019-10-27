package staticproxy;

//使用静态代理 聚合了目标对象（被代理对象）
public class TeacherDaOProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaOProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理 完成默写操作。。。。");
        target.teach();
        System.out.println("代理结束");
    }
}
