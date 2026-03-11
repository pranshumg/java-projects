import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Temperature Converter Program");

    double temp;
    System.out.print("Enter the temperature: ");
    temp = sc.nextDouble();
    String unit;
    System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
    unit = sc.next().toUpperCase();

    double newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : temp * 9 / 5 + 32;
    System.out.printf("New Temperature: %.1f°%s", newTemp, unit);

    sc.close();
  }
}