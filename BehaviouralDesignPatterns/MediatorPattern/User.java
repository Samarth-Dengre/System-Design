package BehaviouralDesignPatterns.MediatorPattern;

public abstract class User {
    private Mediator mediator;
    private String userName;

    User(Mediator mediator, String userName){
        this.mediator = mediator;
        this.userName = userName;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getUserName() {
        return userName;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
