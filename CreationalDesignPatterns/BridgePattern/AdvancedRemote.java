package CreationalDesignPatterns.BridgePattern;

public class AdvancedRemote extends BasicRemote{
    AdvancedRemote(Device device){
        super(device);
    }

    void mute(){
        System.out.println("Remote: mute");
        super.device.setVolume(0);
    }
}
