package decorator;

/**
 * @version V1.0.0
 * @Description 装饰者模式：基本组件 -- 布丁奶茶
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 12:52
 */
public class PuddingMilkTea extends MilkTea{

    public PuddingMilkTea(Size size) {
        description = "Pudding Milk Tea";
        this.size = size;
    }

    public double cost() {
        return size == Size.Big ? 17 : 13;
    }
}
