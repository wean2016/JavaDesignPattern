package singleton;

/**
 * @version V1.0.0
 * @Description 单件模式：急切实例化
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/18 20:23
 */
public class Singleton2 {

    private static Singleton2 uniqueSingleton2;

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return uniqueSingleton2;
    }
}
