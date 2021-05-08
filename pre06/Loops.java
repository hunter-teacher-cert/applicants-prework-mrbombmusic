import java.io.*;
import java.util.*;

public class Loops{

  // original myexp method from exercise 5 part 1
  // public static double myexp(double x, int n) {
  //   double term = 0.0;
  //   for(int i = 0; i < n; i++) {
  //   term += Math.pow(x, i)/factorial(i);
  //   }
  //   return term;
  // }

  public static String check(double x) {
      return x + "\t" + myexp(x, 17) + "\t" + Math.exp(x);
  }

  public static double myexp(double x, int n) {
      double term = 0.0;
      double numerator = 1.0;
      double denominator = 1.0;
      double previousNumerator;
      double previousDenominator;
      for(int i = 0; i < n; i++) {
      term += numerator/denominator;
      previousNumerator = numerator;
      previousDenominator = denominator;
      numerator = previousNumerator*x;
      denominator = previousDenominator*(i+1);
      }
      return term;
  }

  public static int factorial(int n) {
    int result = 1;
    for(int i = n; i > 0; i--) {
      result = i*result;
    }
   return result;
  }

  public static double power(double x, int n) {
    double answer = 1.0;
    for(int i = 0; i < n; i++) {
      answer = answer*x;
    }
      return answer;
  }

  public static void main(String[] args) {
    // power method
  System.out.println(power(7, 6));
    // factorial method
  System.out.println(factorial(10));

    // check method for values 0.1, 1.0, 10.0, and 100.0.
  double x = 0.1;
  for(int i = 0; i < 4; i++) {
  System.out.println(check(x));
  x = x*10.0;
  }
    // check method for values -0.1, -1.0, -10.0, and -100.0.
  double negX = -0.1;
  for(int i = 0; i < 4; i++) {
  System.out.println(check(negX));
  negX = negX*10.0;
 }
 // comment on accuracy
 // -0.1 is consistent thru 15 decimal places
 // -1.0 is consistent thru 14 decimal places
 // -10.0 is way off with myexp outputing 179.45369797750715
 // but Math.pow outputs 4.5399929762484854E-5
 // -100.0 returns to closer accuracy with myexp outputing 4.115271557032277E18
 // and Math.exp outputs 3.720075976020836E-44
}
}
