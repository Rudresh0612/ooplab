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
}
class projectmanager extends teamlead{
String projectname;
double projectbudget;

projectmanager(String name, int id, double salary, int teamsize, double leadershipbonus, String projectname, double projectbudget){
super(name, id, salary, teamsize, leadershipbonus);
this.projectname=projectname;
this.projectbudget=projectbudget;
}

void display(){
System.out.println("Name:"+name);
System.out.println("Id:"+id);
System.out.println("Salary"+salary);
System.out.println("Team size:"+teamsize);
System.out.println("leadership bonus:"+leadershipbonus);
System.out.println("project name:"+projectname);
System.out.println("project budget:"+projectbudget);
}
}
public class Main{
public static void main(String[] args){
projectmanager a= new projectmanager("Rudresh",06,100000,4,25000,"X",1000000);
a.display();
}
}
