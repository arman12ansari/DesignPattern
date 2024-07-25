package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mdarmanansari
 */
public class Amazon {
    private static Amazon instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    private Amazon() {
    }

    // Implementing Singleton Design Pattern
    public static Amazon getInstance() {
        if(instance == null) {
            synchronized (Amazon.class) {
                if(instance == null) {
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void addSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void removeSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void notifySubscribers() {
        for(OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.orderPlacedEvent();
        }
    }
}
