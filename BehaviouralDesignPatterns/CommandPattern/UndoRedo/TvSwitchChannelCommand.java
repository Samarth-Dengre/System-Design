package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

class TvSwitchChannelCommand implements ICommand {
    private Tv mTv;
    private int mOldChannel;
    private int mNewChannel;

    public TvSwitchChannelCommand(Tv tv, int channel) {
        mTv = tv;
        mNewChannel = channel;
    }

    public void execute() {
        mOldChannel = mTv.getChannel();
        mTv.switchChannel(mNewChannel);
    }

    public void undo() {
        mTv.switchChannel(mOldChannel);
    }

    public void redo() {
        mTv.switchChannel(mNewChannel);
    }
}