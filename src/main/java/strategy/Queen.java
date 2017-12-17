package strategy;

/**
 * @version V1.0.0
 * @Description 策略模式：皇后角色
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:52
 */
public class Queen extends Character{
    private Weapon weapon;

    public Queen() {
        this.weapon = new BowAndArrowBehavior();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Queen setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    void fight() {
        weapon.useWeapon();
    }
}
