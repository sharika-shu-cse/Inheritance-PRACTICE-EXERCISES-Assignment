public class AgainTestBetterRectangle {
    public static void main(String[] args) {
        // Create an object of BetterRectangle
        BetterRectangle rect = new BetterRectangle(5, 10, 15, 20);

        // Display the area and perimeter
        System.out.println("Area: " + rect.getArea());        // Output: 300
        System.out.println("Perimeter: " + rect.getPerimeter()); // Output: 70
    }
}