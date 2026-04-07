class Area {
int area(int side) {
        return side * side;
    }

    int area(int length, int width) {
        return length * width;
    }
}
public class Main{
    public static void main(String[] args) {
        Area obj = new Area();

        System.out.println("Area of Square: " + obj.area(5));
        System.out.println("Area of Rectangle: " + obj.area(5, 10));
    }
}
