// Manager class (Subclass of Employee)
public class Manager extends Employee {
    private double bonus; // Bonus for the manager

    // Constructor for Manager
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);  // Call the superclass (Employee) constructor
        this.bonus = bonus;
    }

    // Getter and Setter for bonus
    public void setBonus(double newBonus) {
        bonus = newBonus;
    }

    public double getBonus() {
        return bonus;
    }

    // Override the getSalary method to include the bonus
    @Override
    public double getSalary() {
        return super.getSalary() + bonus;  // Base salary + bonus
    }
}
