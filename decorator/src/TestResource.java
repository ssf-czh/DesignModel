import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * 装饰者模式
 * 在本例中 利用不同的咖啡加料来完成装饰者模式的应用
 *
 * 装饰者类继承被装饰者的类 然后在内部聚合被装饰者 既继承 又聚合 对内有自己装饰者的特性 对呈现被装饰者的特性（因为继承）
 * 然后通过装饰后又成为一个被装饰类 可以套用在另外一个装饰类中， 一层一层 流的思想
 *
 *
 */

public class TestResource {
    public static void main(String[] args) throws Exception {

        /**
         * InputStream就类似与例子中的Drink
         * FileInputStream 类似与LongBlock
         * FilterInputStream 类似与Decorator 在FilterInputStream内有个protected volatile InputStream in; 就是既继承 又聚合的体现
         * DataInputStream 是FileterInputStream具体实现 类似Milk
         *
         */
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("d:\\abc.txt"));
        System.out.println(dataInputStream.read());
        dataInputStream.close();
    }
}
