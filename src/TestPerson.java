public class TestPerson {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("Alice", 2000, "Computer Science");

        // Create an instructor object
        Instructor instructor = new Instructor("Dr. Smith", 1975, 85000.0);

        // Print out the details of the student and instructor
        System.out.println(student.toString());  // Output: Name: Alice, Year of Birth: 2000, Major: Computer Science
        System.out.println(instructor.toString());  // Output: Name: Dr. Smith, Year of Birth: 1975, Salary: 85000.0
    }
}
