import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice, computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choices[r.nextInt(3)];
            System.out.println("Computer Choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("scissors") && computerChoice.equals("paper")) || (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Play again (yes/no) : ");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        sc.close();
    }
}
