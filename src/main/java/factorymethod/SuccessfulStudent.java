package factorymethod;

/**
 * @version V1.0.0
 * @Description 工厂方法：具体产品....学霸学生
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 23:30
 */
public class SuccessfulStudent implements Student {
    public void getDescription() {
        System.out.println("I am a successful student! Haha...");
    }

    public void study() {
        System.out.println("Study is so easy!");
    }
}
