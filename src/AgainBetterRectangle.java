import java.awt.Rectangle;

class AgainBetterRectangle extends Rectangle {

    // Constructor to set location and size using the super class constructor
    public AgainBetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height); // Call the Rectangle class constructor directly
    }

    // Method to calculate and return the perimeter
    public int getPerimeter() {
        return 2 * (width + height);
    }

    // Method to calculate and return the area
    public int getArea() {
        return width * height;
    }
}
