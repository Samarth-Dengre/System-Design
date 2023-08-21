package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

interface ICommand {
    void execute();
    void undo();
    void redo();
}