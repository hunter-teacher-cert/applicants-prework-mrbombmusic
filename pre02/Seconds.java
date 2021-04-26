import java.util.Scanner;

public class Seconds {
  public static void main(String[] args) {
    int totalSeconds;
    Scanner in = new Scanner(System.in);

    final int MINS_IN_HOUR = 60;
    final int SECS_IN_MIN = 60;

    int seconds, minutes, hours;
    int remainingSeconds;   

    System.out.print("Type in any number of seconds: ");
    totalSeconds = in.nextInt();
    System.out.println("The number of seconds you gave was: " + totalSeconds);

    hours = (int) totalSeconds / (MINS_IN_HOUR * SECS_IN_MIN);
    remainingSeconds = totalSeconds % (MINS_IN_HOUR * SECS_IN_MIN);
    minutes = remainingSeconds / SECS_IN_MIN;
    seconds = remainingSeconds % SECS_IN_MIN;

    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",
    totalSeconds, hours, minutes, seconds);

  }
}
