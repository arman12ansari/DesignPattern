package Adapter;

public class YesBankAPI {
    public long getBalance(String userName, String password) {
        return 1000;
    }

    public char doTransaction(String fromUserName, String toUserName, String fromPassword, double amount) {
        return 'Y';
    }

    public boolean changePin(String userName, String password, int currentPin, int newPin) {
        return true;
    }
}
