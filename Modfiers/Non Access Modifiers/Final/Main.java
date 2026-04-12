class Test {
    final int number = 10;
    void display() {
        System.out.println("Number: " + number);
    }
}
public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}