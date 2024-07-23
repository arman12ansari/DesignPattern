package Strategy;

/**
 * @author arman12ansari
 */

public class WalkPathCalculator implements PathCalculator {
    private static WalkPathCalculator instance;

    private WalkPathCalculator() {
    }

    public static WalkPathCalculator getInstance() {
        if (instance == null) {
            synchronized (WalkPathCalculator.class) {
                if (instance == null) {
                    instance = new WalkPathCalculator();
                }
            }
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path for walk from " + source + " to " + destination);
    }
}
