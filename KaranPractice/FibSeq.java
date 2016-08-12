/*
Nehemya McCarter-Ribakoff
generate fib sequence to a given number
7 August 2016
*/
import java.util.Scanner;

public class FibSeq
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int limit = keyboard.nextInt();
    int fib1 = 1;
    int fib2 = 1;
    System.out.println(fib1);
    while (fib1 <= limit)
    {
      System.out.println(fib1);
      fib1 += fib2;
      fib2 = fib1 - fib2;
    }
  }
}
