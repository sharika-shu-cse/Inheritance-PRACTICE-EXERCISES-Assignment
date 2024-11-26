public class MainQUES {
        public static void main(String[] args) {
            // Create a FillInQuestion with the question "The inventor of Java was _James Gosling_"
            FillInQuestion fillInQuestion = new FillInQuestion("The inventor of Java was _James Gosling_");

            // Set the correct answer for the question (the answer between the underscores)
            fillInQuestion.setAnswer("James Gosling");

            // Display the question with blanks (the underscores are replaced with blanks)
            System.out.println("Question: " + fillInQuestion.getQuestionText());

            // Test the answer checking functionality
            System.out.println("Answer 'James Gosling' is correct: " + fillInQuestion.checkAnswer("James Gosling")); // True
            System.out.println("Answer 'Gosling' is incorrect: " + fillInQuestion.checkAnswer("Gosling")); // False
            System.out.println("Answer 'james gosling' is correct (case insensitive): " + fillInQuestion.checkAnswer("james gosling")); // True
        }
    }

