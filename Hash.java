import java.util.Scanner;
import javax.swing.*;

public class HashMap
{
  public void main(String[] args)
  {
    int BUCKET_SIZE = 10;
    int[BUCKET_SIZE] bucket = new int;
    Scanner keyboard = new Scanner(System.in);
    int key;

    do
    {
      System.Out.Println("Please enter a value to hash\n");
      System.Out.Println("When you are done, enter -1 to exit");
      key = keyboard.nextInt();
      simpleHash(key, bucket);
    } while (key != -1);
    System.Out.Println("Done. Here is the hash map:\n");
  }
  public void simpleHash(int key, int[] bucket)
  {
    bucket[key%BUCKET_SIZE] = key;
  }
}
