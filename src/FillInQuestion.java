// FillInQuestion class (Subclass of Question for fill-in-the-blank type questions)
public class FillInQuestion extends Questions {
    private String correctAnswer;  // Store the correct answer to fill in

    // Constructor for FillInQuestion, passing question text to the superclass (Question)
    public FillInQuestion(String questionText) {
        super(questionText);  // Call the constructor of the superclass (Question)
    }

    // Override the setAnswer method to store the correct answer for the fill-in-the-blank
    @Override
    public void setAnswer(String answer) {
        this.correctAnswer = answer;  // Set the correct answer
    }

    // Display the question with the answer replaced by underscores
    @Override
    public String getQuestionText() {
        // Replace the portion between underscores with a series of underscores (____)
        String questionWithBlanks = super.getQuestionText().replace("_", "____");
        return questionWithBlanks;
    }

    // Override the checkAnswer method to compare the user's response with the correct answer
    @Override
    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(correctAnswer);  // Compare response with the correct answer
    }
}
