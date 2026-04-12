class Student {
    private int roll = 101;     
    String name = "Arun";       
    protected String dept = "CSE";
    public String college = "ABC College";
    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("College: " + college);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}