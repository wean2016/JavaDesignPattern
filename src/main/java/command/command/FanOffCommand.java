package command.command;

import command.executor.Fan;

/**
 * @version V1.0.0
 * @Description 命令模式：命令实例
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 11:48
 */
public class FanOffCommand implements Command{

    private final Fan fan;

    public FanOffCommand(Fan fan){
        this.fan = fan;
    }

    public void execute() {
        fan.off();
    }

    public void undo() {
        fan.high();
    }
}
