public class AnyCorrectChoiceQuestion extends QuestionType {
    private String[] correctChoices; // Array of correct choices

    // Constructor for AnyCorrectChoiceQuestion
    public AnyCorrectChoiceQuestion(String questionText) {
        super(questionText); // Call the constructor of the superclass (Question)
    }

    // Set the correct choices (space-separated string, split into an array)
    @Override
    public void setAnswer(String answer) {
        // Split the answer string into individual correct choices
        correctChoices = answer.trim().split("\\s+");
    }

    // Override getQuestionText to add instructions for the user
    @Override
    public String getQuestionText() {
        return super.getQuestionText() + " Please choose one of the correct choices from the options.";
    }

    // Override checkAnswer method to check if the response is one of the correct choices
    @Override
    public boolean checkAnswer(String response) {
        // Normalize the user's response
        String normalizedResponse = response.trim().replaceAll("\\s+", " ").toLowerCase();

        // Check if the normalized response matches any of the correct choices
        for (String choice : correctChoices) {
            if (choice.toLowerCase().equals(normalizedResponse)) {
                return true; // The response matches one of the correct choices
            }
        }
        return false; // No match found
    }
}
