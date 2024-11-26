import javax.swing.JFrame;

public class JFrameClassHierarchy {
    public static void main(String[] args) {
        // Get the class of JFrame
        Class<?> clazz = JFrame.class;

        // Print the class hierarchy
        System.out.println("Class Hierarchy of JFrame:");

        // Loop through the superclass chain
        while (clazz != null) {
            System.out.println(clazz.getName());
            clazz = clazz.getSuperclass(); // Move to the superclass
        }
    }
}
