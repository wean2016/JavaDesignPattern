package command;

import command.command.*;
import command.executor.Fan;
import command.executor.Light;

/**
 * @version V1.0.0
 * @Description 命令模式：测试代码
 * @Author liuyuequn weanyq@gmail.com
 * @Date 2017/12/19 21:01
 */
public class Main {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        EmptyCommand emptyCommand = new EmptyCommand();

        Fan fan = new Fan();
        Light livingRoomLight = new Light("living room");
        Light bedRoomLight = new Light("bed room");

        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);
        LightOnCommand lightOnCommand1 = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand1 = new LightOffCommand(livingRoomLight);
        LightOnCommand lightOnCommand2 = new LightOnCommand(bedRoomLight);
        LightOffCommand lightOffCommand2 = new LightOffCommand(bedRoomLight);

        Command[] partyOn = {lightOnCommand1, lightOnCommand2, fanOnCommand};
        Command[] partyOff = {lightOffCommand1, lightOffCommand2, fanOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setOnCommand(0, lightOnCommand1, lightOffCommand1);
        remoteControl.setOnCommand(1, lightOnCommand2, lightOffCommand2);
        remoteControl.setOnCommand(2, fanOnCommand, fanOffCommand);
        for (int i = 3; i < 6; i++) {
            remoteControl.setOnCommand(i, emptyCommand, emptyCommand);
        }
        remoteControl.setOnCommand(6, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---简单命令---");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println("---简单命令 结束---");
        System.out.println("---宏命令---");
        remoteControl.onButtonWasPushed(6);
        System.out.println("---宏命令 结束---");
        System.out.println("---命令撤回---");
        remoteControl.undoButtonWasPushed();
        System.out.println("---命令撤回 结束---");
    }

}
