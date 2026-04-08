interface Vehicle {
    void start();
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Bike();
        Vehicle v2 = new Car();

        v1.start();
        v2.start();
    }
}