enum Result {
    CORRECT, WRONG, UNANSWERED
}

public class QuizGrader {
    public static void main(String[] args) {
        char[] correctAnswers = {'C', 'A', 'B', 'D'};
        char[] submittedAnswers = new char[4];

        for (int i = 0; i < 4; i++) {
            if (i < args.length && !args[i].isEmpty()) {
                submittedAnswers[i] = args[i].toUpperCase().charAt(0);
            } else {
                submittedAnswers[i] = 'X';
            }
        }

        int correctCount = 0;
        int wrongCount = 0;

        System.out.printf("%-10s %-15s %-15s %-10s\n", "QUESTION", "SUBMITTED ANS", "CORRECT ANS", "RESULT");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            Result questionResult;

            if (submittedAnswers[i] == 'X') {
                questionResult = Result.UNANSWERED;
                wrongCount++;
            } else if (submittedAnswers[i] == correctAnswers[i]) {
                questionResult = Result.CORRECT;
                correctCount++;
            } else {
                questionResult = Result.WRONG;
                wrongCount++;
            }

            System.out.printf("%-10d %-15c %-15c %-10s\n", (i + 1), submittedAnswers[i], correctAnswers[i], questionResult);
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("No. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);

        if (correctCount >= 2) {
            System.out.println("The candidate passed.");
        } else {
            System.out.println("The candidate failed.");
        }
    }
}