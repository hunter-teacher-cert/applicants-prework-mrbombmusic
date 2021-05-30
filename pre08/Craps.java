import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class Craps{

  public static int roll(int sides) {
    Random dice = new Random();
    int diceRoll = dice.nextInt(sides) + 1;
    return diceRoll;
  }

  public static int shoot(int numDice, int maxValue) {
    int rollResult = 0;
    for(int i = 0; i < numDice; i++) {
      rollResult += roll(maxValue);
    }
    return rollResult;
  }

  public static int round() {
    int diceRoll = shoot(2, 6);
    int result = 0;
    if(diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
      result = 0;
    } else if(diceRoll == 7 || diceRoll == 11) {
      result = 1;
    } else {
      int point = diceRoll;
      diceRoll = shoot(2, 6);
      while(diceRoll != point && diceRoll != 7) {
        diceRoll = shoot(2, 6);
        //System.out.println("Roll Again");
      }
      if(diceRoll == point) {
        result = 1;
      } else if(diceRoll == 7) {
        result = 0;
      }
    }
    return result;
  }


public static void main(String[] args) {
  int numRounds;
  Scanner howManyRounds = new Scanner(System.in);

  System.out.print("How many rounds would you like to play?");
  numRounds = howManyRounds.nextInt();
  for(int i = 0; i < numRounds; i++) {
    int roundResult = round();
    System.out.print("Round " + (i + 1) + ": ");
    if(roundResult == 1) {
      System.out.println("You Win!");
    } else {
      System.out.println("You Lose!");
    }
  }
  }

}
