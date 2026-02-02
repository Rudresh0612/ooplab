import java.util.Scanner;
public class Nested {
	public static void main(String args[]) {
		Scanner m=new Scanner(System.in);
		System.out.println(" Enter Marks:");
		int mark= m.nextInt();
		if (mark>90 && mark<=100){
			System.out.println("A Grade");
		}
		else if (mark>80 && mark<=90){
			System.out.println("B Grade");
		}
		else if (mark>70 && mark<=80){
			System.out.println("C Grade");
		}
		else if (mark>60 && mark<=70){
			System.out.println("D Grade");
		}
		else if (mark>40 && mark<=60){
			System.out.println("E Grade");
		}
		else{
			System.out.println("Fail");
		}
		m.close();
	}
}
