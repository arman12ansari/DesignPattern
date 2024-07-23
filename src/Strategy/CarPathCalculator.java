package Strategy;

/**
 * @author arman12ansari
 */

public class CarPathCalculator implements PathCalculator {
    private static CarPathCalculator instance;

    private CarPathCalculator() {
    }

    public static CarPathCalculator getInstance() {
        if (instance == null) {
            synchronized (CarPathCalculator.class) {
                if (instance == null) {
                    instance = new CarPathCalculator();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path for car from " + source + " to " + destination);
    }
}
