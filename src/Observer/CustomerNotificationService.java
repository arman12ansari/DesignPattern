package Observer;/**
 * @author mdarmanansari
 */public class CustomerNotificationService implements OrderPlacedSubscriber {

     //Once this service is created, it will be registered to Amazon as a subscriber.
     CustomerNotificationService() {
         Amazon amazon = Amazon.getInstance();
         amazon.addSubscriber(this);
     }

    @Override
    public void orderPlacedEvent() {
        System.out.println("Customer has been notified about the order placed.");
    }
}
