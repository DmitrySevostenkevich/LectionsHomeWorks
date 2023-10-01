package org.example.lesson7;
public class Employee {
    protected double salary;
    protected void dvoynayaZp(){
        System.out.println("Novaya z/p = " + salary*2);
    }
    protected Employee(double salary2){
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(500);
        System.out.println(employee.salary);
        employee.dvoynayaZp();
    }
     class  EmployeeTest{
        public static void main(String[] args) {
            Employee employee = new Employee(500);
            System.out.println(employee.salary);
            employee.dvoynayaZp();
        }
    }
}
