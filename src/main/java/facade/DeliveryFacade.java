package facade;

/**
 * @version V1.0.0
 * @Description 外观模式：外观类
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/22 17:00
 */
public class DeliveryFacade {

    private Delivery delivery;

    public DeliveryFacade(Delivery delivery){
        this.delivery = delivery;
    }

    public static Delivery getAnOKDelivery(){
        Delivery instance = Delivery.getInstance();
        instance.checkout();
        instance.significance();
        return instance;
    }

}
