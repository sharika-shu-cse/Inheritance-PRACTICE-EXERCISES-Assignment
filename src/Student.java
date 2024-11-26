public class Student extends Person {
    private String major;

    // Constructor to initialize name, year of birth, and major
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth); // Call the constructor of the superclass (Person)
        this.major = major;
    }

    // Getter for the major
    public String getMajor() {
        return major;
    }

    // toString method to return a string representation of the student
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
