public class MainChoice {
        public static void main(String[] args) {
            // Create a new choice question
            ChoiceQuestion question = new ChoiceQuestion("Which of the following are programming languages?");

            // Add choices to the question using the addChoice method
            question.addChoice("Java");
            question.addChoice("Python");
            question.addChoice("Ruby");
            question.addChoice("Javascript");

            // Display the question text and choices
            System.out.println(question.getQuestionText());
            question.displayChoices();  // Display all choices

            // Set the correct answer
            question.setAnswer("Java");

            // Test the answer checking functionality
            System.out.println("Answer 'Java' is correct: " + question.checkAnswer("Java"));  // Expected: true
            System.out.println("Answer 'C++' is correct: " + question.checkAnswer("C++"));  // Expected: false
        }
    }

