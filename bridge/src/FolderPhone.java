
//折叠式手机 继承了抽象类Phone
public class FolderPhone extends Phone {
    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠式手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠式手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠式手机");
    }
}
