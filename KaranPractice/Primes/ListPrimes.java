/*
Nehemya Mccarter-Ribakoff
9 August 2016
List primes by user request
*/
import java.util.Scanner;

public class ListPrimes
{
  public static void main(String[] args)
  {
    System.out.println("This programs lists prime numbers");
    System.out.println("Hit '1' for a prime number, or any other key to quit");
    boolean cont = true;
    Scanner keyboard = new Scanner(System.in);
    int keyHit;
    int primeNumber = 1;
    boolean isPrime = true;
    do
    { 
      keyHit = keyboard.nextInt();
      if (keyHit != 1)
        cont = false; // quit
      else // display prime
      {
        System.out.println(primeNumber);
	primeNumber++;
	do
        {
          primeNumber++; // starts at 3
	  isPrime = true; // resets for condition in next line
	  for (int i = 2; i < primeNumber && isPrime; i++) // check prime
          {
            if (primeNumber % i != 0)
              isPrime = true;
            else
            {
              isPrime = false;
            }
          } 
        } while (!isPrime); // isPrime condition flipped
	                    // on 32 and 41. maybe not good
      }
    } while (cont); // maybe a messy loop of loops
  }
}
