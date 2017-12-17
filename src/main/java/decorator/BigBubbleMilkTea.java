package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式：基本组件 -- 波霸奶茶
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 12:42
 */
public class BigBubbleMilkTea extends MilkTea {

    public BigBubbleMilkTea(Size size) {
        description = "Big Bubble Milk Tea";
        this.size = size;
    }

    public double cost() {
        return size == Size.Big ? 13 : 10;
    }
}
