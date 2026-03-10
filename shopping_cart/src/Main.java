import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char currency = '$';

    System.out.print("What item would you like to buy?: ");
    String item = sc.nextLine();
    System.out.print("What is the price for each?: ");
    double price = sc.nextDouble();
    System.out.print("How many would you like?: ");
    int quantity = sc.nextInt();

    double total = price * quantity;

    System.out.println("\nYou have bought " + quantity + " " + item + "/s");
    System.out.println("Your total is " + currency + total);

    sc.close();
  }
}