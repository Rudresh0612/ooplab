class Employee {
    private int empId;
    private String empName;
    public void setEmpId(int id) {
        empId = id;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpName(String name) {
        empName = name;
    }
    public String getEmpName() {
        return empName;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(06);
        e.setEmpName("Rudresh");
        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
    }
}