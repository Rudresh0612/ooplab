class Employee{
    int empId;
    String empName;
    double salary;

    Employee(int a,String b,double c){
         empId = a;
         empName = b;    
         salary = c;  
}
    void display(){
         System.out.println(empId);
         System.out.println(empName);
         System.out.println(salary);

}
    public static void main(String[] args){
         Employee obj = new Employee(06,"Rudresh",200000);
         obj.display();
    }
}