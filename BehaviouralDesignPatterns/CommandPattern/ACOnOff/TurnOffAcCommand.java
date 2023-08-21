package BehaviouralDesignPatterns.CommandPattern.ACOnOff;

import BehaviouralDesignPatterns.CommandPattern.ACOnOff.Ac;
import BehaviouralDesignPatterns.CommandPattern.ACOnOff.Command;

public class TurnOffAcCommand implements Command {
    Ac ac;
    TurnOffAcCommand(Ac ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOff();
    }
}
