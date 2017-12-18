package abstractfactory;

/**
 * @version V1.0.0
 * @Description
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/18 20:35
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new AbstractFactoryImplA();

        Product1 product1 = factory.concreteProduct1();
        Product2 product2 = factory.concreteProduct2();

        product1.display();
        product2.display();
    }

}
