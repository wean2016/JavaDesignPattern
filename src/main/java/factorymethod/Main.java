package factorymethod;

/**
 * @version V1.0.0
 * @Description 工厂方法：测试方法
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/17 23:35
 */
public class Main {

    public static void main(String[] args) {
        StudentsShop studentsShop1 = new SuccessfulStudentShop();
        StudentsShop studentsShop2 = new LoserStudentShop();

        Student student1 = studentsShop1.getStudent();
        Student student2 = studentsShop2.getStudent();

        studentTest(student1);
        studentTest(student2);
    }

    private final static void studentTest(Student student){
        System.out.println("Take up a student...");
        student.getDescription();
        System.out.println("Test the student....");
        student.study();
    }

}
