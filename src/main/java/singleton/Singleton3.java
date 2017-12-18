package singleton;

/**
 * @version V1.0.0
 * @Description 单件模式：双重检查锁
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/18 20:25
 */
public class Singleton3 {

    private volatile static Singleton3 uniqueSingleton3;

    private Singleton3(){}

    private static Singleton3 getInstance(){
        if (uniqueSingleton3 == null){
            synchronized (Singleton3.class){
                if (uniqueSingleton3 == null){
                    uniqueSingleton3 = new Singleton3();
                }
            }
        }
        return uniqueSingleton3;
    }

}
