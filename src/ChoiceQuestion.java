import java.util.List;
import java.util.ArrayList;
public class ChoiceQuestion extends QuestionPart {

    // Constructor to initialize the choice question with the question text
    public ChoiceQuestion(String questionText) {
        super(questionText); // Calls the constructor of the parent class (Question)
    }

    // Method to add a choice (calls the addChoice method from the superclass)
    public void addChoice(String choice) {
        super.addChoice(choice);  // Calls the addChoice method from the superclass
    }

    // Method to display the choices to the user
    public void displayChoices() {
        List<String> choices = getChoices();  // Get the list of choices from the superclass

        // Check if there are no choices
        if (choices == null || choices.isEmpty()) {
            System.out.println("No choices available.");
            return;
        }

        System.out.println("Choices:");
        // Display all choices with numbering
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + ". " + choices.get(i));  // Display each choice with a number
        }
    }
}
