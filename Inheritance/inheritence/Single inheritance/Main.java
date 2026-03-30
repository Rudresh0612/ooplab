class employee{
String name;
int id;
double salary;

employee(String name,int id,double salary){
this.name=name;
this.id=id;
this.salary=salary;
}
}
class teamlead extends employee{
int teamsize;
double leadershipbonus;

teamlead(String name, int id, double salary, int teamsize, double leadershipbonus){
super(name, id, salary);
this.teamsize=teamsize;
this.leadershipbonus=leadershipbonus;
}

void display(){
System.out.println("Name:"+name);
System.out.println("Id:"+id);
System.out.println("Salary"+salary);
System.out.println("Team size:"+teamsize);
System.out.println("leadership bonus:"+leadershipbonus);
}
}
public class Main{
public static void main(String[] args){
teamlead a= new teamlead("Rudresh",06,100000,4,25000);
a.display();
}
}
