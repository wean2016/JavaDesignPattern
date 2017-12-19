package command.executor;

/**
 * @version V1.0.0
 * @Description 命令模式：执行者
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 11:39
 */
public class Fan {

    public void high(){
        System.out.println("The speed of the fan is turned to high!");
    }

    public void medium(){
        System.out.println("The speed of the fan is turned to medium!");
    }

    public void low(){
        System.out.println("The speed of the fan is turned to medium!");
    }

    public void off(){
        System.out.println("The fan is turned off!");
    }

}
