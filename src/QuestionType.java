public class QuestionType {
    private String questionText;
    private String answer;

    public QuestionType(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean checkAnswer(String response) {
        // Normalize spaces and make both the answer and the response lowercase
        String normalizedAnswer = answer.trim().replaceAll("\\s+", " ").toLowerCase();
        String normalizedResponse = response.trim().replaceAll("\\s+", " ").toLowerCase();
        return normalizedAnswer.equals(normalizedResponse);
    }
}
