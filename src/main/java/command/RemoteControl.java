package command;

import command.command.Command;
import command.command.EmptyCommand;

/**
 * @version V1.0.0
 * @Description 命令模式：请求者
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 12:23
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command emptyCommand = new EmptyCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = emptyCommand;
            offCommands[i] = emptyCommand;
        }
        undoCommand = emptyCommand;
    }

    public void setOnCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                + "     " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
