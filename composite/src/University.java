import java.util.ArrayList;
import java.util.List;

//University就是Composite，可以管理College
public class University extends OrganizationCompoent {

    List<OrganizationCompoent> organizationCompoents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationCompoent organizationCompoent) {
        organizationCompoents.add(organizationCompoent);
    }

    @Override
    protected void remove(OrganizationCompoent organizationCompoent) {
        organizationCompoents.remove(organizationCompoent);
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
        System.out.println("-----------"+getName()+"-----------");
//        遍历list
        for (OrganizationCompoent organizationCompoent : organizationCompoents) {
            organizationCompoent.print();
        }
    }
}
