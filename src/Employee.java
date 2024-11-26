// Employee class (Superclass)
public class Employee {
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Setter and Getter for name
    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    // Setter and Getter for baseSalary
    public void setBaseSalary(double newSalary) {
        baseSalary = newSalary;
    }

    public double getSalary() {
        return baseSalary;
    }
}
