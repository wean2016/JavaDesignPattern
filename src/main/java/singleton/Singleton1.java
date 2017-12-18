package singleton;

/**
 * @version V1.0.0
 * @Description 单件模式：同步 getInstance() 方法
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/18 20:20
 */
public class Singleton1 {

    private static Singleton1 uniqueSingleton1;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (uniqueSingleton1 == null){
            uniqueSingleton1 = new Singleton1();
        }
        return uniqueSingleton1;
    }

}
