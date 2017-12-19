package command.command;

/**
 * @version V1.0.0
 * @Description 命令模式：简单命令
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 11:30
 */
public interface Command {

    void execute();     // 执行命令

    void undo();        // 撤销命令

}
