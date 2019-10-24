//也可以是接口 或者某一个非抽象类
public abstract class OrganizationCompoent {
    private String name;
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public OrganizationCompoent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationCompoent organizationCompoent){
//        默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationCompoent organizationCompoent){
//        默认实现
        throw new UnsupportedOperationException();
    }

     public abstract void print();


}
