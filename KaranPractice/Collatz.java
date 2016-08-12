/*
Nehemya McCarter-Ribakoff
Practice from Github
4 August 2016
*/

/*
PROMPT:
 n > 1
 while n != 1
   if n is even, n = n / 2
   if n is odd, n = 3n + 1
 return n
*/
import java.util.Scanner;

public class Collatz
{
  public static void main(String[] args)
  {
    System.out.println("Enter a number greater than 1: ");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int  steps = 0;
    while (n != 1)
    {
      if (n % 2 == 0) // n is even
        n = n / 2;
      else            // n is odd
        n = (n * 3) + 1;
      steps++;
    }
    System.out.println("Number of steps to 1: " + steps);
  }
}
