package BehaviouralDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private List<User> users;
    MediatorImpl(){
        users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            if(!user.getUserName().equalsIgnoreCase(u.getUserName())){
                u.receiveMessage(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
