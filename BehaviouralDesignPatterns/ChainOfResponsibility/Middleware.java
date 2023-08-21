package BehaviouralDesignPatterns.ChainOfResponsibility;

public abstract class Middleware {
    private Middleware next;
    public static Middleware link(Middleware first, Middleware... nextMiddleware){
        Middleware head = first;
        for(Middleware m : nextMiddleware){
            head.next = m;
            head = m;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
