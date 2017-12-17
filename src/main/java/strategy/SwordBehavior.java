package strategy;

/**
 * @version V1.0.0
 * @Description 策略模式：宝剑武器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:48
 */
public class SwordBehavior implements Weapon {
    public void useWeapon() {
        System.out.println("用宝剑挥舞");
    }
}
