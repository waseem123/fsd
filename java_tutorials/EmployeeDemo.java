class Employee {
    int employee_id;
    String employee_name;
    int employee_salary;

    public void setEmployee() {
        employee_id = 101;
        employee_name = "Alex";
        employee_salary = 50000;
    }

    public void getEmployee() {
        System.out.println("EMPLOYEE ID     - " + employee_id);
        System.out.println("EMPLOYEE NAME   - " + employee_name);
        System.out.println("EMPLOYEE SALARY - " + employee_salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployee();
        e1.getEmployee();
        System.out.println("__________________________");

        Employee e2 = new Employee();
        e2.employee_id = 102;
        e2.employee_name = "John";
        e2.employee_salary = 45000;
        e2.getEmployee();
    }
}
