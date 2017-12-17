package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式：基本组件 -- 波霸奶绿
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 12:44
 */
public class BigBubbleGreenMilkTea extends MilkTea {

    public BigBubbleGreenMilkTea(Size size) {
        description = "Big Bubble Green Milk Tea";
        this.size = size;
    }

    public double cost() {
        return size == Size.Big ? 13 : 10;
    }
}
