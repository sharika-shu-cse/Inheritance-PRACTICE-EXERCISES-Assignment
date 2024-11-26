// Question class (Superclass for all types of questions)
public class Questions {
    private String questionText;
    private String answer;

    // Constructor to initialize question text
    public Questions(String questionText) {
        this.questionText = questionText;
    }

    // Set the correct answer (this will be overridden by subclasses)
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Get the question text
    public String getQuestionText() {
        return questionText;
    }

    // Check if the answer is correct (to be overridden by subclasses)
    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }
}
