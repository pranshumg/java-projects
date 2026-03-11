import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Weight Conversion Program");
    System.out.println("1: Convert lbs to kgs");
    System.out.println("2: Convert kgs to lbs");

    int choice;
    System.out.print("Choose an option: ");
    choice = sc.nextInt();

    double weight, newWeight;
    double d = 0.45359237;
    if (choice == 1) {
      System.out.print("Enter the weight in lbs: ");
      weight = sc.nextDouble();
      newWeight = weight * d;
      System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
    } else if (choice == 2) {
      System.out.print("Enter the weight in kgs: ");
      weight = sc.nextDouble();
      newWeight = weight / d;
      System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
    } else {
      System.out.println("That was not a valid choice");
    }

    sc.close();
  }
}