import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {

    // Constructor to initialize the rectangle using x, y, width, and height
    public BetterRectangle(int x, int y, int width, int height) {
        // Call the setLocation and setSize methods from Rectangle class
        setLocation(x, y);    // Sets the top-left corner of the rectangle
        setSize(width, height);  // Sets the width and height of the rectangle
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return (int) (getWidth() * getHeight());
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (int) (getWidth() + getHeight());
    }
}
