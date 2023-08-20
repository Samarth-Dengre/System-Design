package CreationalDesignPatterns.FacadePattern;

public class OrderFacade {
    private Invoice invoice;
    private Payment payment;
    private ShipOrder shipOrder;

    OrderFacade(){
        this.invoice = new Invoice();
        this.shipOrder = new ShipOrder();
        this.payment = new Payment();
    }

    void createOrder(){
        payment.makePayment();
        invoice.makeInvoice();
        shipOrder.ship();
    }
}
