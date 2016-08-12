public class practice
{
  public static void main(String[] args)
  {
    // prints 0 to 100, but "fizz" on multiples of 3
    for (int i = 1; i <= 100; i++)
    {
      if (i % 3 == 0 && i % 5 == 0)
        System.out.Println("fizzbuzz\n");
      else if (i % 3 == 0)
        System.out.Println("fizz\n");
      else if (i % 5 == 0)
        System.out.Println("buzz\n");
      else
        System.out.Println(i);
    }
  }
}
