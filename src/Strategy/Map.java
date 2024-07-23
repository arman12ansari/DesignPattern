package Strategy;

/**
 * @author arman12ansari
 */

public class Map {
    public void findPath(String source, String destination, Mode mode) {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);

        if(pathCalculator == null) {
            System.out.println("Invalid mode");
            return;
        }
        pathCalculator.findPath(source, destination);
    }
}
