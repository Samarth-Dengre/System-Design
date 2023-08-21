package BehaviouralDesignPatterns.CommandPattern.ACOnOff;

public class Client {
    public static void main(String[] args) {
        Ac ac = new Ac();
        Remote remote = new Remote();
        remote.setCommand(new TurnOnAcCommand(ac));
        remote.execute();

        remote.setCommand(new TurnOffAcCommand(ac));
        remote.execute();
    }
}
