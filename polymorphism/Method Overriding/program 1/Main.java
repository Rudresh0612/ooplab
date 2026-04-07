import java.util.Scanner;
class Product {
    double price;
    Product(double price) {
        this.price = price;
    }
    double calculateDiscnt() {
        return price;
    }
}
class Electronics extends Product {
    Electronics(double price) {
        super(price);
    }
    double calculateDiscnt() {
        return price - (price * 0.10);   
    }
}
class Clothing extends Product {
    Clothing(double price) {
        super(price);
    }
    double calculateDiscnt() {
        return price - (price * 0.20);   
    }
}
class Groceries extends Product {
    Groceries(double price) {
        super(price);
    }
    double calculateDiscnt() {
        return price - (price * 0.05);   
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Electronics Price: ");
        double e = sc.nextDouble();
        System.out.print("Enter Clothing Price: ");
        double c = sc.nextDouble();
        System.out.print("Enter Groceries Price: ");
        double g = sc.nextDouble();
        Electronics elec = new Electronics(e);
        Clothing cloth = new Clothing(c);
        Groceries gro = new Groceries(g);
        System.out.println("Electronics price after discount: " + elec.calculateDiscnt());
        System.out.println("Clothing price after discount: " + cloth.calculateDiscnt());
        System.out.println("Groceries price after discount: " + gro.calculateDiscnt());
        sc.close();
    }
}