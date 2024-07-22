package Adapter;

public class ICICIBankAPI {
    public double checkBalance(String userToken) {
        return 2000;
    }

    public int transfer(String userToken, String toUserToken, double amount) {
        return 1;
    }

    public boolean changePin(String userToken, int currentPin, int newPin) {
        return true;
    }
}
