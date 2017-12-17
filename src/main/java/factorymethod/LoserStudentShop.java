package factorymethod;

/**
 * @version V1.0.0
 * @Description 工厂方法：具体工厂....学渣商店
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 23:34
 */
public class LoserStudentShop extends StudentsShop{
    public Student getStudent() {
        return new LoserStudent();
    }
}
