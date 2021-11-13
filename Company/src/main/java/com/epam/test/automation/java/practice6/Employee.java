package main.java.com.epam.test.automation.java.practice6;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Employee {

    private String lastName;
    private double salary;
    private double bonus;

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public Employee(String lastName, double salary){
        this.lastName = lastName;
        this.salary = salary;
    }

    public double setBonus(double bonus){
        return bonus;
    }

    public double toPay(double salary, double bonus){
        return salary+bonus;
    }
}

