public class MainString {
        public static void main(String[] args) {
            // Create a new choice question
            ChoiceQuestionString question = new ChoiceQuestionString("Which of the following are programming languages?");

            // Add choices to the question using the addChoice method
            question.addChoice("Java");
            question.addChoice("Python");
            question.addChoice("Ruby");
            question.addChoice("Javascript");

            // Set the correct answer
            question.setAnswer("Java");

            // Display the question and choices using toString
            System.out.println(question.toString());  // Display the entire question with choices

            // Test the answer checking functionality
            System.out.println("Answer 'Java' is correct: " + question.checkAnswer("Java"));  // Expected: true
            System.out.println("Answer 'C++' is correct: " + question.checkAnswer("C++"));  // Expected: false
        }
    }

