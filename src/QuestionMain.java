public class QuestionMain {
        public static void main(String[] args) {
            // Create a question with multiple correct choices
            AnyCorrectChoiceQuestion question = new AnyCorrectChoiceQuestion("Which of the following are programming languages?");

            // Set the correct choices (choices are space-separated)
            question.setAnswer("Java Python C++ Ruby");

            // Display the question with instructions
            System.out.println(question.getQuestionText());

            // Test the answer checking functionality
            System.out.println("Answer 'java' is correct: " + question.checkAnswer("java")); // true
            System.out.println("Answer 'Python' is correct: " + question.checkAnswer("Python")); // true
            System.out.println("Answer 'c++' is correct: " + question.checkAnswer("c++")); // true
            System.out.println("Answer 'Javascript' is incorrect: " + question.checkAnswer("Javascript")); // false
            System.out.println("Answer 'ruby' is correct: " + question.checkAnswer("ruby")); // true
            System.out.println("Answer 'C++' is correct (case-insensitive): " + question.checkAnswer("C++")); // true
        }
    }

