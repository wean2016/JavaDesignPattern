package factorymethod;

/**
 * @version V1.0.0
 * @Description 工厂方法：具体产品.....学渣
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 23:32
 */
public class LoserStudent implements Student{
    public void getDescription() {
        System.out.println("Emmmm...I am a loser student..");
    }

    public void study() {
        System.out.println("Study? That's fucking hard! Damn it!");
    }
}
