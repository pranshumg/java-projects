import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the principal amount: ");
    double principal = sc.nextDouble();
    System.out.print("Enter the interest rate (in %): ");
    double rate = sc.nextDouble() / 100;
    System.out.print("Enter the # of times compounded per year: ");
    int timeCompounded = sc.nextInt();
    System.out.print("Enter the # of years: ");
    int years = sc.nextInt();
    System.out.print("");

    double amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);
    System.out.printf("\nThe amount after %d years is: $%.2f", years, amount);

    sc.close();
  }
}