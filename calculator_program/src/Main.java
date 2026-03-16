import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double num1;
    System.out.print("Enter the first number: ");
    num1 = sc.nextDouble();
    char operator;
    System.out.print("Enter an operator (+, -, *, /, ^): ");
    operator = sc.next().charAt(0);
    double num2;
    System.out.print("Enter the second number: ");
    num2 = sc.nextDouble();

    double result = 0;
    boolean validOperation = true;
    switch(operator) {
      case '+' -> result = num1 + num2;
      case '-' -> result = num1 - num2;
      case '*' -> result = num1 * num2;
      case '/' -> {
        if (num2 == 0) {
          System.out.println("Cannot Divide by zero!");
          validOperation = false;
        } else {
          result = num1 / num2;
        }
      }
      case '^' -> result = Math.pow(num1, num2);
      default -> {
        System.out.println("Invalid Operator!");
        validOperation = false;
      }
    }

    if (validOperation) {
      System.out.printf("Result: %.2f", result);
    }

    sc.close();
  }
}