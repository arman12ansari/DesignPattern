package Observer;

/**
 * @author mdarmanansari
 */
public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        CustomerNotificationService customerNotificationService = new CustomerNotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();
        amazon.notifySubscribers();
    }
}
