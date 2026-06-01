class Employee {
String name;
int id;
Employee(String name, int id) {
this.name = name;
this.id = id;
}
void display() {
System.out.println("Name: " + name);
System.out.println("Id: " + id);
}
}
class Developer extends Employee {
String programmingLanguage;
Developer(String name, int id, String programmingLanguage) {
super(name, id);
this.programmingLanguage = programmingLanguage;
}
void showDeveloper() {
System.out.println("Language: " + programmingLanguage);
}
}
class Manager extends Employee {
int teamSize;
Manager(String name, int id, int teamSize) {
super(name, id);
this.teamSize = teamSize;
}
void showManager() {
System.out.println("Team Size: " + teamSize);
}
}
public class Main {
public static void main(String[] args) {
Developer d = new Developer("Ravi", 101, "Java");
Manager m = new Manager("Darshon", 102, 5);
d.display();
d.showDeveloper();
System.out.println();
m.display();
m.showManager();
}
}