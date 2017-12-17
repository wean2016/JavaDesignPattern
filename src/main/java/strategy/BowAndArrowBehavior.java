package strategy;

/**
 * @version V1.0.0
 * @Description 策略模式：弓箭武器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:50
 */
public class BowAndArrowBehavior implements Weapon {
    public void useWeapon() {
        System.out.println("用弓箭射杀");
    }
}
