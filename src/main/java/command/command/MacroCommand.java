package command.command;

/**
 * @version V1.0.0
 * @Description 命令模式：宏命令
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 12:19
 */
public class MacroCommand implements Command{

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
