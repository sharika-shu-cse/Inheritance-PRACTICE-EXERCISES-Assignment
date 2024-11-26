// NumericQuestion class (Subclass of Question for numeric type questions)
public class NumericQuestion extends Question {
    private double correctAnswer;  // Store the numeric answer

    // Constructor for NumericQuestion, passing question text to the superclass
    public NumericQuestion(String questionText) {
        super(questionText);
    }

    // Override the setAnswer method to accept a numeric answer as a double
    @Override
    public void setAnswer(String answer) {
        // Parse the string answer as a double
        this.correctAnswer = Double.parseDouble(answer);
    }

    // Override the checkAnswer method to compare numeric responses with a tolerance of 0.01
    @Override
    public boolean checkAnswer(String response) {
        try {
            // Convert the response to double
            double userAnswer = Double.parseDouble(response);

            // Check if the difference between the user answer and the correct answer is within tolerance
            return Math.abs(correctAnswer - userAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            return false; // If the response cannot be parsed as a number, return false
        }
    }
}
