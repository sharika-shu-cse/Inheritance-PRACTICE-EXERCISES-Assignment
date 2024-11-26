import java.util.ArrayList;
import java.util.List;

public class QuestionString {
    private String questionText;  // Text of the question
    private String answer;        // Correct answer
    private List<String> choices; // List to store the choices

    // Constructor for initializing question text
    public QuestionString(String questionText) {
        this.questionText = questionText;
        this.choices = new ArrayList<>(); // Initialize the list to store choices
    }

    // Set the correct answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Get the question text
    public String getQuestionText() {
        return questionText;
    }

    // Check if the given response matches the correct answer (case-insensitive)
    public boolean checkAnswer(String response) {
        return answer.trim().equalsIgnoreCase(response.trim());
    }

    // Method to add choices to the question
    public void addChoice(String choice) {
        choices.add(choice); // Adds the choice to the list of choices
    }

    // Retrieve the choices (to be used in subclasses like ChoiceQuestion)
    public List<String> getChoices() {
        return choices;
    }

    // Method to check if there are no choices
    public boolean hasNoChoices() {
        return choices.isEmpty();  // Checks if the list of choices is empty
    }

    // toString method to provide a string representation of the Question object
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question: ").append(questionText).append("\n");
        if (answer != null && !answer.isEmpty()) {
            sb.append("Correct Answer: ").append(answer).append("\n");
        }
        return sb.toString();
    }
}
