import java.util.Scanner;
public class Return{
int add(int a,int b){
return a+b;
}
public static void main(String args[]){
Scanner r=new Scanner(System.in);
System.out.print("Enter first number: ");
int x = r.nextInt();
System.out.print("Enter second number: ");
int y = r.nextInt();
Return obj = new Return(); 
int sum = obj.add(x, y);             
System.out.println("Sum = " + sum);
r.close();
}
}