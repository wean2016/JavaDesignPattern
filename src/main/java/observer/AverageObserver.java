package observer;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @version V1.0.0
 * @Description 观察者：最近五个数字的平均数
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/16 11:36
 */
public class AverageObserver implements Observer {

    private LinkedList<Integer> recentNumbers = new LinkedList<Integer>();      // 保存最近收到的五个数字

    public void update(NumberGenerator numberGenerator) {
        recentNumbers.addLast(numberGenerator.getNumber());
        System.out.println("AverageObserver! ave = " + calculateAverage());
    }

    private int calculateAverage(){         // 计算最近收到的五个数字的平均数
        int size = recentNumbers.size();
        if (size == 0){     // 没有数字
            return 0;
        }else if (size <= 5){       // 如果数字大于 0 个且小于等于 5 个
            int ave = 0;
            Iterator<Integer> iterator = recentNumbers.iterator();
            while (iterator.hasNext()){
                ave += iterator.next();
            }
            ave /= size;
            return ave;
        }else {     // 数字多于 5 个
            recentNumbers.removeFirst();
            return calculateAverage();
        }
    }
}
