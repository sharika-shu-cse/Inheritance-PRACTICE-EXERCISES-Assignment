// Question class (Superclass for all types of questions)
public class Question {
    private String questionText;
    private String answer;

    // Constructor to initialize question text
    public Question(String questionText) {
        this.questionText = questionText;
    }

    // Method to set the correct answer (to be overridden by subclasses)
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Method to check if the response is correct (to be overridden by subclasses)
    public boolean checkAnswer(String response) {
        return response.equalsIgnoreCase(answer);
    }

    // Getter for the question text
    public String getQuestionText() {
        return questionText;
    }
}
