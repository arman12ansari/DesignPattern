package Strategy;

/**
 * @author arman12ansari
 */

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(Mode mode) {
        return switch (mode) {
            case CAR -> CarPathCalculator.getInstance();
            case BIKE -> BikePathCalculator.getInstance();
            case WALK -> WalkPathCalculator.getInstance();
            default -> null;
        };
    }
}
