package BehaviouralDesignPatterns.ChainOfResponsibility;

public class ThrottlingMiddleware extends Middleware{
    private int requestPerMinute;
    private int request;
    private long currentTime;

    ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        currentTime = System.currentTimeMillis();
    }
    @Override
    public boolean check(String email, String password) {
        if (System.currentTimeMillis() > currentTime + 60_000) {
            request = 0;
            currentTime = System.currentTimeMillis();
        }

        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            System.exit(0);
        }
        return checkNext(email, password);
    }
}
