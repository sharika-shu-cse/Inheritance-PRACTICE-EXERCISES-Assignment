public class Questioning {
    private String questionText;  // The text of the question
    private String answer;        // The correct answer to the question

    // Constructor that initializes the question text
    public Questioning(String questionText) {
        this.questionText = questionText;
    }

    // Set the correct answer (to be overridden by subclasses)
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    // Get the question text
    public String getQuestionText() {
        return questionText;
    }

    // Modified checkAnswer method that ignores spaces and case sensitivity
    public boolean checkAnswer(String response) {
        // Normalize spaces and make both the answer and the response lowercase
        String normalizedAnswer = answer.trim().replaceAll("\\s+", " ").toLowerCase();
        String normalizedResponse = response.trim().replaceAll("\\s+", " ").toLowerCase();

        // Compare the normalized strings
        return normalizedAnswer.equals(normalizedResponse);
    }
}
