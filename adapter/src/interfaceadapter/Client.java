package interfaceadapter;

public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m2() {
                System.out.println("适配了该方法");
            }
        };

        absAdapter.m2();
    }

}
