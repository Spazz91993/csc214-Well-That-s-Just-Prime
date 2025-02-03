package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
   System.out.println("Welcome! Let's do some prime factorization!");
    Scanner theScanner = new Scanner(System.in);
    System.out.print("What integer would you like to factorize? ");
    int num = theScanner.nextInt();
    System.out.println("Alright.. Got it.. Let's do this.");
    Factorizer theFactorizer = new Factorizer();
    ArrayList<Integer> theFactors = theFactorizer.primeFactors(num);
    System.out.println(theFactors);
    System.out.println("Thanks for checking out my program. Have a great day.");
    theScanner.close();
  }
}
