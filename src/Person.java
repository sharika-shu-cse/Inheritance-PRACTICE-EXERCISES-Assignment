public class Person {
    private String name;
    private int yearOfBirth;

    // Constructor to initialize name and year of birth
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Getters for name and year of birth
    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    // toString method to return a string representation of the person
    @Override
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}

