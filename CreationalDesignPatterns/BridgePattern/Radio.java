package CreationalDesignPatterns.BridgePattern;

public class Radio implements Device{
    private int channel;
    private int volume;
    private boolean power;

    Radio(){
        volume = 10;
        power = false;
        channel = 1;
    }

    @Override
    public boolean isEnabled() {
        return power;
    }

    @Override
    public void enable() {
        power = true;
    }

    @Override
    public void disable() {
        power = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm Radio set.");
        System.out.println("| I'm " + (power ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }
}
