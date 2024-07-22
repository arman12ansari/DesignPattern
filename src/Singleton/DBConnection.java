package Singleton;

public class DBConnection {
    private int noOfConnections;
    private final int limit = 4;

    private static DBConnection instance;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
     public boolean connect() {
         if (noOfConnections < limit) {
             noOfConnections++;
             return true;
         }
         return false;
     }
}
