package factorymethod;

/**
 * @version V1.0.0
 * @Description 工厂方法：具体工厂.....学霸商店
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 23:29
 */
public class SuccessfulStudentShop extends StudentsShop {
    public Student getStudent() {
        return new SuccessfulStudent();
    }
}
