package Adapter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        User arman = new User("arman", "1234");
        User rohit = new User("rohit", "5678");

        phonePe.checkBalance(arman);
        phonePe.transferMoney(arman, rohit, 1000);
        phonePe.changePin(arman, 1234, 4321);

    }
}