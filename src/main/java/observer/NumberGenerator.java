package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @version V1.0.0
 * @Description 被观察者：数字生成器
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/16 11:05
 */
public abstract class NumberGenerator {

    private List<Observer> observerList = new ArrayList<Observer>();        // 观察者列表

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(){      // 向被观察者发送通知
        Iterator<Observer> iterator = observerList.iterator();
        while (iterator.hasNext()){
            iterator.next().update(this);
        }
    }

    public abstract int getNumber();        // 获得数字
    public abstract void execute() throws InterruptedException;         // 生成数据

}
