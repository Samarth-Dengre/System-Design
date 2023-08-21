package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

import java.util.Stack;

class CommandManager {
    private Stack<ICommand> mUndoStack = new Stack<>();
    private Stack<ICommand> mRedoStack = new Stack<>();

    public CommandManager() {}

    public void executeCmd(ICommand command) {
        mRedoStack.clear(); // clear the redo stack
        command.execute();
        mUndoStack.push(command);
    }

    public void undo() {
        if (mUndoStack.isEmpty()) {
            return;
        }
        ICommand undoneCommand = mUndoStack.pop();
        undoneCommand.undo();
        mRedoStack.push(undoneCommand);
    }

    public void redo() {
        if (mRedoStack.isEmpty()) {
            return;
        }
        ICommand redoneCommand = mRedoStack.pop();
        redoneCommand.redo();
        mUndoStack.push(redoneCommand);
    }
}