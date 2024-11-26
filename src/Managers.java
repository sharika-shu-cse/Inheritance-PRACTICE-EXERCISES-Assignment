public class Managers extends Employeework {
    private String department;

    // Constructor to initialize name, salary, and department
    public Managers(String name, double salary, String department) {
        super(name, salary); // Call the constructor of the superclass (Employee)
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Override toString method to include the department
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
