package Adapter;

public class PhonePe {
    private final BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter) {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    public void checkBalance(User user) {
        double balance = bankAPIAdapter.checkBalance(user);
        System.out.println("Balance: " + balance);
    }

    public void transferMoney(User fromUser, User toUser, double amount) {
        double balance = bankAPIAdapter.checkBalance(fromUser);
        if(balance < amount) {
            System.out.println("Transaction failed due to insufficient balance");
        }

        int status = bankAPIAdapter.doTransaction(fromUser, toUser, amount);

        switch (status) {
            case 0:
                System.out.println("Transaction failed");
                break;
            case 1:
                System.out.println("Transaction successful");
                break;
            default:
                System.out.println("In Progress");
                break;
        }
    }

    public void changePin(User user, int currentPin, int newPin) {
        boolean status = bankAPIAdapter.changePin(user, currentPin, newPin);
        if(status) {
            System.out.println("Pin changed successfully");
        } else {
            System.out.println("Pin change failed");
        }
    }
}
