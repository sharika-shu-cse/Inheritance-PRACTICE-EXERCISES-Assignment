public class LabeledPoint {
    private int x;        // X-coordinate
    private int y;        // Y-coordinate
    private String label; // Label for the point

    // Constructor to initialize the x, y coordinates and label
    public LabeledPoint(int x, int y, String label) {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    // toString method to return the string representation of the LabeledPoint
    @Override
    public String toString() {
        return "Point[" + "x=" + x + ", y=" + y + ", label='" + label + "']";
    }

    // Main method to test the LabeledPoint class
    public static void main(String[] args) {
        // Create a LabeledPoint object
        LabeledPoint point = new LabeledPoint(10, 20, "A");

        // Print the LabeledPoint object, which calls the toString method
        System.out.println(point); // Output: Point[x=10, y=20, label='A']
    }
}
