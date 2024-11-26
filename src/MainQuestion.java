public class MainQuestion {
        public static void main(String[] args) {
            // Create a NumericQuestion with the question "What is 5.67 + 4.33?"
            NumericQuestion numericQuestion = new NumericQuestion("What is 5.67 + 4.33?");

            // Set the correct answer for the question (expected numeric answer)
            numericQuestion.setAnswer("10.00");

            // Test with various answers to check the tolerance functionality
            System.out.println("Question: " + numericQuestion.getQuestionText());
            System.out.println("Answer '10.00' is correct: " + numericQuestion.checkAnswer("10.00"));  // True
            System.out.println("Answer '10.01' is correct (within tolerance): " + numericQuestion.checkAnswer("10.01"));  // True
            System.out.println("Answer '9.99' is correct (within tolerance): " + numericQuestion.checkAnswer("9.99"));  // True
            System.out.println("Answer '11.00' is incorrect: " + numericQuestion.checkAnswer("11.00"));  // False
        }
    }


