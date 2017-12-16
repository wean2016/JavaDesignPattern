package observer;

/**
 * @version V1.0.0
 * @Description 测试方法
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/16 11:48
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();

        Observer observer1 = new AverageObserver();
        Observer observer2 = new SumObserver();

        numberGenerator.addObserver(observer1);
        numberGenerator.addObserver(observer2);

        numberGenerator.execute();
    }
}
