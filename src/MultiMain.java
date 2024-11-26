public class MultiMain {
        public static void main(String[] args) {
            // Create a question with multiple correct choices
            MultiChoiceQuestion question = new MultiChoiceQuestion("Which of the following are programming languages?");

            // Set the correct choices (choices are space-separated)
            question.setAnswer("Java Python C++ Ruby");

            // Display the question with instructions
            System.out.println(question.getQuestionText());

            // Test the answer checking functionality
            System.out.println("Answer 'java python ruby' is correct: " + question.checkAnswer("java python ruby")); // true
            System.out.println("Answer 'C++ python java ruby' is correct: " + question.checkAnswer("C++ python java ruby")); // true
            System.out.println("Answer 'java c++ ruby' is correct: " + question.checkAnswer("java c++ ruby")); // true
            System.out.println("Answer 'python ruby java' is correct: " + question.checkAnswer("python ruby java")); // true
            System.out.println("Answer 'Java' is incorrect: " + question.checkAnswer("Java")); // false
            System.out.println("Answer 'Java C++ Ruby' is incorrect: " + question.checkAnswer("Java C++ Ruby")); // false
            System.out.println("Answer 'Java Python C++ Ruby Ruby' is incorrect (duplicate): " + question.checkAnswer("Java Python C++ Ruby Ruby")); // true (duplicate ignored)
        }
    }

