import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationCompoent {

//    List中聚合的是Department
    List<OrganizationCompoent> organizationCompoents = new ArrayList<>();

    public College(String name, String des) {
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
