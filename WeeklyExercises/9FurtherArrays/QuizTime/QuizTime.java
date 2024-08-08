package week9;

public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add questions to the quiz
        quiz.addQuestion("What is the capital of France?", "Paris");
        quiz.addQuestion("What is the largest planet in the solar system?", "Jupiter");
        quiz.addQuestion("Who wrote 'To Kill a Mockingbird'?", "Harper Lee");

        // Present the quiz
        quiz.giveQuiz();
    }
}
