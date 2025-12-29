public class Retail
{
public static void main(String[] args)
{

int itema=2, itemb=1, itemc=3;
int  costa=200, costb=75, costc=500;
double price;
double discount=0.10;
double tax=0.05;
//let find out the discount
price =(itema*costa)+(itemb*costb)+(itemc*costc);
price=price-(discount*price);
price= price+(tax*price);
System.out.println("The user needs to pay the amount of "+ price);

}
}