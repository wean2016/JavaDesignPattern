package abstractfactory;

/**
 * @version V1.0.0
 * @Description
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/18 20:35
 */
public class AbstractFactoryImplB implements AbstractFactory {
    public Product1 concreteProduct1() {
        return new Product1ImplB();
    }

    public Product2 concreteProduct2() {
        return new Product2ImplB();
    }
}
