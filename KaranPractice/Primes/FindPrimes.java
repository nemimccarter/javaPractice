/*
Nehemya McCarter-Ribakoff
7 August 2016
List primes up to a given number
*/
import java.util.Scanner;
import java.lang.*;

public class FindPrimes
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int limit = keyboard.nextInt();
    boolean isPrime = false;
    for (int i = 2; i < limit; i++)
    {
      if (limit % i != 0)
        isPrime = true;
      else
      {
        isPrime = false;
	System.out.println(limit + " is not prime");
	System.exit(0);
      }
    }
    System.out.println(limit + " is prime");
  }
}
