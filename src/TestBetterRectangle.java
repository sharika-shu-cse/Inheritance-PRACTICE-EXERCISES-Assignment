public class TestBetterRectangle {
    public static void main(String[] args) {
        // Create a BetterRectangle object with specific position and size
        BetterRectangle rect = new BetterRectangle(10, 20, 30, 40);

        // Print the area and perimeter of the rectangle
        System.out.println("Area of the rectangle: " + rect.getArea());
        System.out.println("Perimeter of the rectangle: " + rect.getPerimeter());
    }
}
