class Employee {
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

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 50000);

        System.out.println("Employee Name: " + emp.getName());
        emp.setSalary(55000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
