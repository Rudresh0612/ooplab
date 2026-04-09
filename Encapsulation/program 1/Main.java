class BankAccount {
    private double balance;
    public void setBalance(double b) {
        balance = b;
    }
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Account Balance: " + acc.getBalance());
    }
}