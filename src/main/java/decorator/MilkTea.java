package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式：抽象的被装饰者
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 12:37
 */
public abstract class MilkTea {

    String description = "UnKnown Milk Tea";
    Size size;


    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
