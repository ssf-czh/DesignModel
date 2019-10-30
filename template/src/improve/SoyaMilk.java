package improve;

//add添加配料 而其他方法都是相同，所以只有add是抽象方法
public abstract class SoyaMilk {
    final void make(){
        select();
        if(customerWantAdd()) add();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步 选择好的黄豆");
    }

//    子类具体实现
    abstract void add();

    void soak() {
        System.out.println("第三步  黄豆和配料开始浸泡，需要三个小时");

    }

    void beat() {
        System.out.println("第四步 黄豆和配料放到豆浆机打碎");
    }

//    钩子方法 决定是否要添加配料
    boolean customerWantAdd(){
        return true;
    }
}
