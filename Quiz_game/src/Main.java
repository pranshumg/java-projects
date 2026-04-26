import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered as brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computer?",
                              "What was the first programming language?"};

        String[][] options = {{"1. Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Hard drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Baggage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0, guess;

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
        System.out.println();

        for (int i = 0; i < questions.length; ++i) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            if (guess == answers[i]) {
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                ++score;
            } else {
                System.out.println("********");
                System.out.println(" WRONG!");
                System.out.println("********");
            }
            System.out.println();
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        sc.close();
    }
}
