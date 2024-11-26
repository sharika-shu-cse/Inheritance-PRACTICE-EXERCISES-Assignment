public class MainEmployee {
        public static void main(String[] args) {
            // Create an Employee object
            Employee employee = new Employee("John Doe", 50000);

            // Create a Manager object
            Manager manager = new Manager("Alice Smith", 70000, 15000);

            // Print out details
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Salary: " + employee.getSalary());

            System.out.println("\nManager Name: " + manager.getName());
            System.out.println("Manager Base Salary: " + manager.getSalary());
            System.out.println("Manager Bonus: " + manager.getBonus());
            System.out.println("Manager Total Salary (Base + Bonus): " + manager.getSalary());
        }
    }


