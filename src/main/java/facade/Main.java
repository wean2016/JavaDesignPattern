package facade;

/**
 * @version V1.0.0
 * @Description 外观模式：测试代码
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/22 17:02
 */
public class Main {

    public static void main(String[] args) {
        Delivery delivery = DeliveryFacade.getAnOKDelivery();
    }

}
