package CreationalDesignPatterns.FacadePattern;

public class Client {
    public static void main(String[] args) {
//        If any of the logic for placing order changes, client has no impact of it.
//        Only Facade is dependent on the system
        OrderFacade facade = new OrderFacade();
        facade.createOrder();
    }
}
