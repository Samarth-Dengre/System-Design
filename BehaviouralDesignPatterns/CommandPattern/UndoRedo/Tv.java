package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

public class Tv {
    private boolean mOn;
    private int mChannel;

    public Tv() {}

    void switchOn() {
        mOn = true;
    }

    void switchOff() {
        mOn = false;
    }

    void switchChannel(int channel) {
        mChannel = channel;
    }

    boolean isOn() {
        return mOn;
    }

    int getChannel() {
        return mChannel;
    }
}