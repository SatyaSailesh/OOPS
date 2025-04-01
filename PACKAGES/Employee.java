package company.hr;
public class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
package company.finance;

import company.hr.Employee;

public class Payroll {
    
    public void processPayroll(Employee employee) {
        System.out.println("Processing payroll for:");
        employee.displayInfo();
        
        // Example payroll calculation (just a placeholder logic)
        double netPay = employee.getSalary(); // Here you can add deductions or bonuses
        System.out.println("Net Pay for Employee ID " + employee.getId() + ": " + netPay);
    }
}

import company.hr.Employee;
import company.finance.Payroll;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 5000.00);
        Payroll payroll = new Payroll();
        payroll.processPayroll(emp);
    }
}
