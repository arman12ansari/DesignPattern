package Adapter;

public class ICICIBankAPIAdapter implements BankAPIAdapter {

    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public double checkBalance(User user) {
        return iciciBankAPI.checkBalance(generateToken(user));
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
        return iciciBankAPI.transfer(generateToken(fromUser), generateToken(toUser), amount);
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBankAPI.changePin(generateToken(user), currentPin, newPin);
    }

    private String generateToken(User user) {
        return user.getUserName() + user.getPassword();
    }
}
