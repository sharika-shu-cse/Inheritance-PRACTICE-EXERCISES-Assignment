import java.awt.Point;

public class LabeledPointAgain {
    private Point location; // A Point object to store the x and y coordinates
    private String label;   // Label for the point

    // Constructor to initialize the location (Point) and label
    public LabeledPointAgain(int x, int y, String label) {
        this.location = new Point(x, y); // Create a new Point with x and y
        this.label = label;
    }

    // toString method to return a string representation of the LabeledPoint
    @Override
    public String toString() {
        // Return the string representation of the Point and append the label
        return "Point" + location.toString() + ", label='" + label + "'";
    }

    // Main method to test the LabeledPoint class
    public static void main(String[] args) {
        // Create a LabeledPoint object
        LabeledPoint point = new LabeledPoint(10, 20, "A");

        // Print the LabeledPoint object, which calls the toString method
        System.out.println(point); // Output: Point[x=10, y=20], label='A'
    }
}
