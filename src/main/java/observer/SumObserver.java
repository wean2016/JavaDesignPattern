package observer;

/**
 * @version V1.0.0
 * @Description 总数观察者，记录下从程序开始运行以来被通知的数字总和
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/16 11:31
 */
public class SumObserver implements Observer {

    private int currentSum = 0;     // 当前总和


    public void update(NumberGenerator numberGenerator) {
        currentSum += numberGenerator.getNumber();
        System.out.println("SumObserver!  currentSum = " + currentSum);
    }
}
