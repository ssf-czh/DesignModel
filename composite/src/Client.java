/**
 * // 面对具有树型结构的时候用组合结构效果不错
 * 主要有抽象的Component  可以使具体类、抽象类与接口
 * 接下来就是他的子类 子类可以分成叶子结点和非叶子结点
 * 子类中用List聚合了其他子类  类似与数据结构中的树结点中的vector
 */
public class Client {
    public static void main(String[] args) {
        //从大倒下创建对象 University  College Department
//        University
        OrganizationCompoent university = new University("清华大学", "顶级大学");
//        College
        OrganizationCompoent computerCollege = new College("计算机学院","计算机学院");
        OrganizationCompoent infoCollege = new College("信息工程","信息工程");

//        将专业department加入到学院中
        computerCollege.add(new Department("软件工程","软件工程不错"));
        computerCollege.add((new Department("网络工程","网络工程不错")));
        computerCollege.add(new Department("计算机科学与技术","王牌专业"));

        //
        infoCollege.add(new Department("通信工程","不好学"));
        infoCollege.add(new Department("信息工程","好学"));

//        将学院加入到学校中
        university.add(computerCollege);
        university.add(infoCollege);

        university.print();

        computerCollege.print();
    }
}
