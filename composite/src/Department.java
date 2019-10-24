import java.util.ArrayList;
import java.util.List;

//最小叶子结点单位 不用再写add和remove
public class Department extends OrganizationCompoent {

    public Department(String name, String des) {
        super(name, des);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void print() {

        System.out.println(getName());
    }
}
