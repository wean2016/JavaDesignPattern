package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式: 尺寸装饰器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:03
 */
public class SizeDecorator extends CondimentDecorator{

    MilkTea milkTea;

    public String getDescription() {
        return milkTea.getDescription() + ", " + size;
    }

    public double cost() {
        return milkTea.cost();
    }
}
