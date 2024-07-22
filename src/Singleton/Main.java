package Singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection.connect());
        System.out.println(dbConnection.connect());
        System.out.println(dbConnection.connect());
        System.out.println(dbConnection.connect());
        System.out.println(dbConnection.connect());
    }
}