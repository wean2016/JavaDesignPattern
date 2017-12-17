package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式：椰果装饰器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:01
 */
public class CoconutJelly extends CondimentDecorator{

    MilkTea milkTea;

    public CoconutJelly(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    public String getDescription() {
        return milkTea.getDescription() + ", Coconut Jelly";
    }

    public double cost() {
        return milkTea.cost() + 1;
    }
}
