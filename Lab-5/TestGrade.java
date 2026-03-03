import java.util.Scanner;
public class TestGrade {
    enum Result {
        CORRECT,
        WRONG,
        UNANSWERED
    }
    public static void main(String[] argss) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String of answers: ");
        String s= sc.nextLine();
        if (s.length() < 8) {
            System.out.println("Please provide exactly 8 answers (use 'X' for unanswered).");
            return;
        }
        char[] correctAnswers = {'C', 'A', 'B', 'D', 'B', 'C', 'C', 'A'};
        int correctCount = 0;
        int wrongCount = 0;
        int unansweredCount = 0;
        System.out.println("---------------------------------------------------------");
        System.out.printf("%s    %s   %s    %s  %n", "QUESTION", "SUBMITTED ANS", "CORRECT ANS", "RESULT");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            char submitted = s.charAt(i);
            submitted=Character.toUpperCase(submitted);
            char correct = correctAnswers[i];
            Result result;

            // 4. Determine the Result
            if (submitted == 'X') {
                result = Result.UNANSWERED;
                unansweredCount++;
            } else if (submitted == correct) {
                result = Result.CORRECT;
                correctCount++;
            } else {
                result = Result.WRONG;
                wrongCount++;
            }
            System.out.printf("%-10d %-15s %-15s %-10s%n", (i + 1), submitted, correct, result);
        }

        System.out.println("---------------------------------------------------------");

        // 5. Print Summary
        System.out.println("No. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);
        System.out.println("No. of questions unanswered: " + unansweredCount);

        // Optional: Check pass mark (5 out of 8)
        if (correctCount >= 5) {
            System.out.println("\nStatus: PASSED");
        } else {
            System.out.println("\nStatus: FAILED");
        }
    }
}