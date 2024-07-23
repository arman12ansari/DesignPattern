package Strategy;
/**
 * @author arman12ansari
 */

public class BikePathCalculator implements PathCalculator {
    private static BikePathCalculator instance;

    private BikePathCalculator() {
    }

    public static BikePathCalculator getInstance() {
        if (instance == null) {
            synchronized (BikePathCalculator.class) {
                if (instance == null) {
                    instance = new BikePathCalculator();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path for bike from " + source + " to " + destination);
    }
}
