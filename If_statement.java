import java.util.Scanner;
public class If_statement {
    public static void main(String args[]) {
        Scanner ag = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ag.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        ag.close();
    }
}
