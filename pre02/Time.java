import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args) {
    double hour = 23.0; // current hours
    double minute = 55.0; // current minutes
    double seconds = ((hour*60.0)+minute)*60.0; // seconds in the day
    double secondsTotal = ((24.0*60.0)*60.0); // total seconds in a day
    double secondsLeft = secondsTotal - seconds; // seconds left in the Friday
    double pastHour = 23.0; // past hours
    double pastMinute = 30.0; // past minutes


    System.out.print("The number of seconds since midnight is: ");
    System.out.println(seconds);
    System.out.print("The number of seconds left in the day is: ");
    System.out.println(secondsLeft);
    System.out.print("The percentage of the day that has passed is: ");
    System.out.println((seconds/secondsTotal)*100);
    System.out.print("The elasped time from when I started is ");
    System.out.println((hour - pastHour) + " hours and " + (minute - pastMinute) + " minutes");
  }
}
