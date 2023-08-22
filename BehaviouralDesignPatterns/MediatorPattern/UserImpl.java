package BehaviouralDesignPatterns.MediatorPattern;

public class UserImpl extends User{
    UserImpl(Mediator mediator, String userName){
        super(mediator, userName);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println(super.getUserName() + ", Sending Message " + message);
        super.getMediator().sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(super.getUserName() + ", Message Recieved " + message);
    }
}
