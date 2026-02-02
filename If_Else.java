import java.util.Scanner;
public class If_Else{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number: ");
        int x = a.nextInt();
        if (x > 0) {
            System.out.println("x is a positive number");
		}
		else if (x < 0) {
            System.out.println("x is a negative number");
		}
		else {
            System.out.println("x is neither a positive number nor a negative number");
		}
		a.close();
	}
}
