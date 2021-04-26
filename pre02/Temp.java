import java.util.Scanner;

public class Temp {

  public static void main(String[] args) {
    double celcius;
    Scanner in = new Scanner(System.in);
    double fahrenheit;

    System.out.print("Enter a temperature in Celcius: ");
    celcius = in.nextDouble();

    fahrenheit = (celcius * (9.0/5.0)) + 32;

    System.out.printf("%.1f C = %.1f F\n", celcius, fahrenheit);
  }
}
