public class Instructor extends Person {
    private double salary;

    // Constructor to initialize name, year of birth, and salary
    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth); // Call the constructor of the superclass (Person)
        this.salary = salary;
    }

    // Getter for the salary
    public double getSalary() {
        return salary;
    }

    // toString method to return a string representation of the instructor
    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary;
    }
}
