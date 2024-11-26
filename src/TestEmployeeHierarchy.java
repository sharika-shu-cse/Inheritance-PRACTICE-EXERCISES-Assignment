public class TestEmployeeHierarchy {
    public static void main(String[] args) {
        // Create an Employee object
        Employeework employee = new Employeework("John Doe", 50000);

        // Create a Manager object
        Managers manager = new Managers("Jane Smith", 80000, "Sales");

        // Create an Executive object
        Executive executive = new Executive("Alice Johnson", 120000, "Sales");

        // Print the details of each object using the toString method
        System.out.println(employee.toString());  // Output: Name: John Doe, Salary: 50000.0
        System.out.println(manager.toString());   // Output: Name: Jane Smith, Salary: 80000.0, Department: Sales
        System.out.println(executive.toString()); // Output: Name: Alice Johnson, Salary: 120000.0, Department: Sales, Role: Executive
    }
}
