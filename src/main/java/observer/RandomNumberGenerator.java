package observer;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;

/**
 * @version V1.0.0
 * @Description 被观察者: 随机数生成器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/16 11:23
 */
public class RandomNumberGenerator extends NumberGenerator {

    private int number;     // 当前数字
    private Random random = new Random();

    public int getNumber() {
        return number;
    }

    public void execute() throws InterruptedException {
        while (true){
            number = random.nextInt(50);
            notifyObservers();
            Thread.sleep(1000);
        }
    }
}
