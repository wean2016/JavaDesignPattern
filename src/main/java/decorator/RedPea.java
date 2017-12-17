package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式：红豆装饰器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 12:58
 */
public class RedPea extends CondimentDecorator {

    MilkTea milkTea;

    public RedPea(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    public String getDescription() {
        return milkTea.getDescription() + ", Red Pea";
    }

    public double cost() {
        return milkTea.cost() + 1;
    }
}
