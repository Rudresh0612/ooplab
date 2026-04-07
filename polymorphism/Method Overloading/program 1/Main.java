class AddExample {
int add(int a, int b) {
return a + b;
}
int add(int a, int b, int c) {
return a + b + c;
}
}
public class Main {
public static void main(String[] args) {
AddExample obj = new AddExample();
System.out.println("Sum of 2 numbers: " + obj.add(5, 10));
System.out.println("Sum of 3 numbers: " + obj.add(5, 10, 15));
}
}