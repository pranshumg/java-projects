import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter an adjective (description): ");
    String adjective1 = sc.nextLine();
    System.out.print("Enter a noun (animal or person): ");
    String noun1 = sc.nextLine();
    System.out.print("Enter an adjective (description): ");
    String adjective2 = sc.nextLine();
    System.out.print("Enter a verb with -ing (action): ");
    String verb1 = sc.nextLine();
    System.out.print("Enter an adjective (description): ");
    String adjective3 = sc.nextLine();

    System.out.println("\nToday i went to a " + adjective1 + " zoo.");
    System.out.println("In an exhitbit, I saw a " + noun1 + ".");
    System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
    System.out.println("I was " + adjective3 + "!");

    sc.close();
  }
}