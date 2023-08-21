package BehaviouralDesignPatterns.CommandPattern.ACOnOff;

import BehaviouralDesignPatterns.CommandPattern.ACOnOff.Command;

public class Remote {
    private Command command;
    Remote(){}

    void setCommand(Command c){
        command = c;
    }

    void execute(){
        command.execute();
    }
}
