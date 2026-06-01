class Device {
void powerOn() {
System.out.println("Device is powered on");
}
}

class Computer extends Device {
void process() {
System.out.println("Computer is processing");
}
}

class Laptop extends Computer {
void portable() {
System.out.println("Laptop is portable");
}
}

class Tablet extends Computer {
void touchScreen() {
System.out.println("Tablet has touch screen");
}
}

public class Main{
public static void main(String[] args) {
Laptop l = new Laptop();
l.powerOn();
l.process();
l.portable();
System.out.println();
Tablet t = new Tablet();
t.powerOn();
t.process();
t.touchScreen();
}
}