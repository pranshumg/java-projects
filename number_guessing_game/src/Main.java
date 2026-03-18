import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rm = new Random();

    int attempts = 0;
    int mn = 1;
    int mx = 100;
    int randomNumber = rm.nextInt(mn, mx + 1);

    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d:\n", mn, mx);

    int guess;
    do {
      System.out.print("Enter a guess: ");
      guess = sc.nextInt();
      ++attempts;
      if (guess < randomNumber) {
        System.out.println("TOO LOW! Try again");
      } else if (guess > randomNumber) {
        System.out.println("TOO HIGH! Try again");
      } else {
        System.out.printf("CORRECT! The number was %d\n", randomNumber);
        System.out.printf("# of attempts: %d\n", attempts);
      }
    } while (guess != randomNumber);

    sc.close();
  }
}