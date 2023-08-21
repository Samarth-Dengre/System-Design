package BehaviouralDesignPatterns.CommandPattern.UndoRedo;

public class Client {
    public static void main(String[] args) {
        Tv tv = new Tv();
        CommandManager commandManager = new CommandManager();

        ICommand c1 = new TvSwitchChannelCommand(tv, 1);
        commandManager.executeCmd(c1);
        System.out.println("Switched to channel: " + tv.getChannel());

        ICommand c2 = new TvSwitchChannelCommand(tv, 2);
        commandManager.executeCmd(c2);
        System.out.println("Switched to channel: " + tv.getChannel());

        ICommand c3 = new TvSwitchChannelCommand(tv, 3);
        commandManager.executeCmd(c3);
        System.out.println("Switched to channel: " + tv.getChannel());

        System.out.println("Undoing...");
        commandManager.undo();
        System.out.println("Current channel: " + tv.getChannel());

        System.out.println("Undoing...");
        commandManager.undo();
        System.out.println("Current channel: " + tv.getChannel());

        System.out.println("Redoing...");
        commandManager.redo();
        System.out.println("Current channel: " + tv.getChannel());

        System.out.println("Redoing...");
        commandManager.redo();
        System.out.println("Current channel: " + tv.getChannel());
    }
}
