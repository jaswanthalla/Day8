import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private List<String> options;
    private int correctOptionIndex; 

    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }
}

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; 

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "What keyword is used to create an instance of a class?",
                List.of("new", "this", "create", "instance"),
                0 
        ));

        questions.add(new Question(
                "Which of these is NOT a Java primitive type?",
                List.of("int", "float", "String", "char"),
                2 
        ));
        
        questions.add(new Question(
                "What is the output of 5 + 3 * 2?",
                List.of("16", "11", "13", "10"),
                1 
        ));

        questions.add(new Question(
                "Which collection from java.util guarantees no duplicates?",
                List.of("List", "Map", "Set", "Array"),
                2 
        ));

        System.out.println("--- Welcome to the Java Quiz! ---");
        System.out.println("Answer the following " + questions.size() + " questions. Good luck!\n");

        for (Question q : questions) {
            System.out.println(q.getQuestionText());
            for (int i = 0; i < q.getOptions().size(); i++) {
                System.out.println((i + 1) + ". " + q.getOptions().get(i));
            }

            int userAnswer = -1;
            boolean validAnswer = false;
            
            while (!validAnswer) {
                System.out.print("Enter your choice (1-" + q.getOptions().size() + "): ");
                try {
                    userAnswer = scanner.nextInt();
                    if (userAnswer >= 1 && userAnswer <= q.getOptions().size()) {
                        validAnswer = true;
                    } else {
                        System.out.println("Invalid choice. Please enter a number between 1 and " + q.getOptions().size() + ".");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); 
                }
            }

            if (userAnswer - 1 == q.getCorrectOptionIndex()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                int correctIndex = q.getCorrectOptionIndex();
                System.out.println("Wrong! The correct answer was: " + (correctIndex + 1) + ". " + q.getOptions().get(correctIndex) + "\n");
            }
        }

        System.out.println("--- Quiz Finished! ---");
        System.out.println("Your final score is: " + score + " out of " + questions.size());

        scanner.close();
    }
}