package week9;
import java.util.Scanner;

public class Quiz {
    private static final int MAX_QUESTIONS = 25;
    private Question[] questions;
    private int numQuestions;

    public Quiz() {
        questions = new Question[MAX_QUESTIONS];
        numQuestions = 0;
    }

    public void addQuestion(String question, String answer) {
        if (numQuestions < MAX_QUESTIONS) {
            questions[numQuestions] = new Question(question, answer);
            numQuestions++;
            System.out.println("Question added to the quiz.");
        } else {
            System.out.println("Cannot add more questions. Maximum limit reached.");
        }
    }

    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Let's start the quiz!");
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i].getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equalsIgnoreCase(questions[i].getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + questions[i].getAnswer());
            }
        }

        System.out.println("\nQuiz ended. Your score: " + score + "/" + numQuestions);
    }
}
