package command.command;

import command.executor.Light;

/**
 * @version V1.0.0
 * @Description 命令模式：命令实例
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 12:17
 */
public class LightOffCommand implements Command{

    private final Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.lightOff();
    }

    public void undo() {
        light.lightOn();
    }
}
