package Adapter;

public class YesBankAPIAdapter implements BankAPIAdapter {

    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double checkBalance(User user) {
        long balance = yesBankAPI.getBalance(user.getUserName(), user.getPassword());
        return (double) balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        char status = yesBankAPI.doTransaction(fromUser.getUserName(), toUser.getUserName(), fromUser.getPassword(), amount);
        if(status == 'Y') {
            return 1;
        } else if(status == 'N') {
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankAPI.changePin(user.getUserName(), user.getPassword(), currentPin, newPin);
    }
}
