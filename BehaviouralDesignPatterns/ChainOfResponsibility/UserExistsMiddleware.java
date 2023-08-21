package BehaviouralDesignPatterns.ChainOfResponsibility;

public class UserExistsMiddleware extends Middleware{
    private Server server;
    public UserExistsMiddleware(Server server) {
        this.server = server;
    }
    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("Invalid Email");
            return false;
        }else if(!server.isValidPassword(email, password)){
            System.out.println("Invalid Password");
            return false;
        }

        return checkNext(email, password);
    }
}
