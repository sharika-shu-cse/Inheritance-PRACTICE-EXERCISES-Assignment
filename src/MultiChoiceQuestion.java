import java.util.HashSet;
import java.util.Set;

public class MultiChoiceQuestion extends MultiQuestion {
    private Set<String> correctChoices; // Set to store unique correct choices

    public MultiChoiceQuestion(String questionText) {
        super(questionText); // Call the constructor of the superclass (Question)
        correctChoices = new HashSet<>(); // Initialize the set for correct choices
    }

    // Set the correct choices (space-separated string)
    @Override
    public void setAnswer(String answer) {
        String[] choices = answer.trim().split("\\s+");
        // Add each choice to the set (ignores duplicates automatically)
        for (String choice : choices) {
            correctChoices.add(choice.toLowerCase().trim()); // Store lowercase choices
        }
    }

    // Override getQuestionText to add instructions for the user
    @Override
    public String getQuestionText() {
        return super.getQuestionText() + " Please provide all correct choices, separated by spaces.";
    }

    // Override checkAnswer method to check if the response contains all correct choices
    @Override
    public boolean checkAnswer(String response) {
        String[] userChoices = response.trim().split("\\s+");
        Set<String> userChoiceSet = new HashSet<>();

        // Add user choices to a set (ignores duplicates)
        for (String choice : userChoices) {
            userChoiceSet.add(choice.toLowerCase().trim());
        }

        // Check if the user's choices match exactly the correct choices
        return userChoiceSet.equals(correctChoices);
    }
}
