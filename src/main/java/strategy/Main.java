package strategy;

/**
 * @version V1.0.0
 * @Description 策略模式：测试方法
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 13:53
 */
public class Main {

    public static void main(String[] args) {
        King king = new King();
        Queen queen = new Queen();
        System.out.println("I am a king!");
        king.fight();
        System.out.println("I am a queen!");
        queen.fight();

        king.setWeapon(new BowAndArrowBehavior());
        System.out.println("The king changes his weapon!");
        king.fight();
    }

}
