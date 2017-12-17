package decorator;
import static decorator.Size.Big;
import static decorator.Size.middle;
/**
 * @version V1.0.0
 * @Description 装饰者模式：测试方法
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:04
 */
public class Main {

    public static void main(String[] args) {
        MilkTea milkTea1 = new BigBubbleGreenMilkTea(middle);
        System.out.println(milkTea1.getDescription() + " ----- ￥ " + milkTea1.cost());

        milkTea1 = new RedPea(milkTea1);
        System.out.println(milkTea1.getDescription() + " ----- ￥ " + milkTea1.cost());

        MilkTea milkTea2 = new PuddingMilkTea(Big);
        System.out.println(milkTea2.getDescription() + " ----- ￥ " + milkTea2.cost());

        milkTea2 =
                new CoconutJelly(
                    new RedPea(
                            milkTea2));
        System.out.println(milkTea2.getDescription() + " ----- ￥ " + milkTea2.cost());
    }

}
