public class Executive extends Managers {
    // Constructor to initialize name, salary, department
    public Executive(String name, double salary, String department) {
        super(name, salary, department); // Call the constructor of the superclass (Manager)
    }

    // Override toString method to reflect the executive's role
    @Override
    public String toString() {
        return super.toString() + ", Role: Executive";
    }
}
