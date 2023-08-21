package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

class TvOffCommand implements ICommand {
    private TvOnCommand mTvOnCommand;

    public TvOffCommand(Tv tv) {
        mTvOnCommand = new TvOnCommand(tv);
    }

    public void execute() {
        mTvOnCommand.undo();
    }

    public void undo() {
        mTvOnCommand.execute();
    }

    public void redo() {
        mTvOnCommand.undo();
    }
}
