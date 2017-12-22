package facade;

/**
 * @version V1.0.0
 * @Description 外观模式：待装饰类
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/22 16:55
 */
public class Delivery {

    private Delivery(){}

    public static Delivery getInstance(){
        System.out.println("拿到一个快递！");
        return new Delivery();
    }

    public void checkout(){
        System.out.println("检查快递！");
    }

    public void significance(){
        System.out.println("签收快递!");
    }
}
