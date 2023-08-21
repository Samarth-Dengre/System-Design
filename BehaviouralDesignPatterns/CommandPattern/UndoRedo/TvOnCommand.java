package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

class TvOnCommand implements ICommand {
    private Tv mTv;

    public TvOnCommand(Tv tv) {
        mTv = tv;
    }

    public void execute() {
        mTv.switchOn();
    }

    public void undo() {
        mTv.switchOff();
    }

    public void redo() {
        mTv.switchOn();
    }
}