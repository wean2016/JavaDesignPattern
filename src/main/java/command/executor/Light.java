package command.executor;

/**
 * @version V1.0.0
 * @Description 命令模式：执行者
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 11:32
 */
public class Light {

    private final String location;

    public Light(String location){
        this.location = location;
    }


    public void lightOn(){
        System.out.println("The light in " + location +" is been turned on!");
    }

    public void lightOff(){
        System.out.println("The light in " + location +" is been turned off!");
    }
}
