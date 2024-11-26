public class MainQuestioning {
        public static void main(String[] args) {
            // Create a Question with the answer "James Gosling"
            Questioning question = new Questioning("Who invented Java?");

            // Set the correct answer for the question
            question.setAnswer("James Gosling");

            // Test the answer checking functionality
            System.out.println("Answer 'JAMES gosling' is correct: " + question.checkAnswer("JAMES gosling")); // true
            System.out.println("Answer '  James   Gosling  ' is correct: " + question.checkAnswer("  James   Gosling  ")); // true
            System.out.println("Answer 'James gosling' is correct: " + question.checkAnswer("James gosling")); // true
            System.out.println("Answer 'James GOSLING' is correct: " + question.checkAnswer("James GOSLING")); // true
            System.out.println("Answer 'james gosling' is correct: " + question.checkAnswer("james gosling")); // true
            System.out.println("Answer 'James' is incorrect: " + question.checkAnswer("James")); // false
        }
    }


