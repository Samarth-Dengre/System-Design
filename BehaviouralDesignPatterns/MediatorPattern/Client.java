package BehaviouralDesignPatterns.MediatorPattern;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        User user1 = new UserImpl(mediator, "Ram");
        User user2 = new UserImpl(mediator, "Shyam");
        User user3 = new UserImpl(mediator, "Raghav");
        User user4 = new UserImpl(mediator, "Samarth");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user2.sendMessage("Hello All");
        user4.sendMessage("How Are you");
    }
}
