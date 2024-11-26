public class MultiQuestion {
        private String questionText;  // The text of the question
        private String answer;        // The correct answer to the question

        public MultiQuestion(String questionText) {
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

