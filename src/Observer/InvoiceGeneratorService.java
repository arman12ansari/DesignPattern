package Observer;

/**
 * @author mdarmanansari
 */
public class InvoiceGeneratorService implements OrderPlacedSubscriber {

    //Once this service is created, it will be registered to Amazon as a subscriber.
    InvoiceGeneratorService() {
        Amazon amazon = Amazon.getInstance();
        amazon.addSubscriber(this);
    }

    @Override
    public void orderPlacedEvent() {
        System.out.println("Invoice has been generated for the order placed.");
    }
}
