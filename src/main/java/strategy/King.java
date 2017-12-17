package strategy;

/**
 * @version V1.0.0
 * @Description 策略模式：国王角色
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:47
 */
public class King extends Character{

    private Weapon weapon;

    public King() {
        this.weapon = new SwordBehavior();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public King setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    void fight() {
        weapon.useWeapon();
    }
}
