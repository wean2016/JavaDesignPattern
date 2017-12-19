package command.command;

import command.executor.Fan;

/**
 * @version V1.0.0
 * @Description 命令模式：命令实例
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 11:46
 */
public class FanOnCommand implements Command {

    private final Fan fan;

    public FanOnCommand(Fan fan){
        this.fan = fan;
    }

    public void execute() {
        fan.high();
    }

    public void undo() {
        fan.off();
    }
}
