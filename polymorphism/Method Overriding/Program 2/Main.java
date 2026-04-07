import java.util.Scanner;
class Bank {
    int getBalance() {
        return 0;
    }
}
class BankA extends Bank {
    int balance;
    BankA(int balance){
        this.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}
class BankB extends Bank {
    int balance;
    BankB(int balance){
        this.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}
class BankC extends Bank {
    int balance;
    BankC(int balance){
        this.balance = balance;
    }
    int getBalance(){
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter balance for BankA: ");
        int a = sc.nextInt();
        System.out.print("Enter balance for BankB: ");
        int b = sc.nextInt();
        System.out.print("Enter balance for BankC: ");
        int c = sc.nextInt();
        BankA A = new BankA(a);
        BankB B = new BankB(b);
        BankC C = new BankC(c);
        System.out.println("Balance in BankA: " + A.getBalance());
        System.out.println("Balance in BankB: " + B.getBalance());
        System.out.println("Balance in BankC: " + C.getBalance());
        sc.close();
    }
}