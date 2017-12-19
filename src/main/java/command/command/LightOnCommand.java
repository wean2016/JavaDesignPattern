package command.command;

import command.executor.Light;

/**
 * @version V1.0.0
 * @Description 命令模式：命令实例
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 11:58
 */
public class LightOnCommand implements Command{

    private final Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute() {
        light.lightOn();
    }

    public void undo() {
        light.lightOff();
    }
}
