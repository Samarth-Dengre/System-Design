package BehaviouralDesignPatterns.CommandPattern.ACOnOff;

import BehaviouralDesignPatterns.CommandPattern.ACOnOff.Ac;
import BehaviouralDesignPatterns.CommandPattern.ACOnOff.Command;

public class TurnOnAcCommand implements Command {
    Ac ac;
    TurnOnAcCommand(Ac ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOn();
    }
}
