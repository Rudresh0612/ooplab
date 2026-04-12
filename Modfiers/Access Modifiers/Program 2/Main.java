class Bank {
    private double balance = 5000;
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.showBalance();
    }
}