package Task6;

import java.util.ArrayList;

class Employee {
    private String name;
    private String jobTitle;
    private int salary;

    public Employee(String name, String jobTitle, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void show() {
        System.out.println("Name: " + this.name + " Role: " + this.jobTitle + " Salary: " + this.salary);
    }

    public void increaseSalary(int amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println("Salary increased by " + amount + ". New Salary: " + this.salary);
        } else {
            System.out.println("Increase amount should be positive.");
        }
    }

    public void decreaseSalary(int amount) {
        if (amount > 0 && this.salary - amount >= 0) {
            this.salary -= amount;
            System.out.println("Salary decreased by " + amount + ". New Salary: " + this.salary);
        } else {
            System.out.println("Decrease amount should be positive and less than current salary.");
        }
    }
}

class Manager {
    private ArrayList<Employee> employees;

    public Manager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public void increaseSalary(int amount, Employee employee) {
        if (employees.contains(employee)) {
            employee.increaseSalary(amount);
        } else {
            System.out.println("Employee not found in the list.");
        }
    }

    public void decreaseSalary(int amount, Employee employee) {
        if (employees.contains(employee)) {
            employee.decreaseSalary(amount);
        } else {
            System.out.println("Employee not found in the list.");
        }
    }

    public void showAllEmployees() {
        for (Employee emp : employees) {
            emp.show();
        }
    }
}

public class Manage {
    public static void main(String[] args) {
        Manager manager = new Manager();
        
        Employee emp1 = new Employee("John Doe", "Software Engineer", 70000);
        Employee emp2 = new Employee("Jane Smith", "Project Manager", 85000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        System.out.println("All employees:");
        manager.showAllEmployees();

        System.out.println("\nIncreasing salary for John Doe by 5000");
        manager.increaseSalary(5000, emp1);

        System.out.println("\nDecreasing salary for Jane Smith by 3000");
        manager.decreaseSalary(3000, emp2);

        System.out.println("\nAll employees after salary updates:");
        manager.showAllEmployees();
    }
}
