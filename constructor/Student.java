class Student {
    int rollNo;
    String name;

    Student(int a,String b){
         rollNo = a;
         name = b;        
}
    void display(){
         System.out.println(rollNo);
         System.out.println(name);
}
    public static void main(String[] args){
         Student obj = new Student(4,"Rudresh");
         obj.display();
    }
}