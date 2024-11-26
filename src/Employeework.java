public class Employeework {
    private String name;
    private double salary;

    // Constructor to initialize name and salary
    public Employeework(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters for name and salary
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method to return a string representation of the employee
    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }
}
