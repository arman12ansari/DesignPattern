package Strategy;

/**
 * @author arman12ansari
 */

public class Client {
    public static void main(String[] args) {
        Map map = new Map();
        map.findPath("Bengaluru", "Kolkata", Mode.CAR);
        map.findPath("Chennai", "Bengaluru", Mode.BIKE);
        map.findPath("HSR Layout", "BTM Layout", Mode.WALK);

    }
}
