import java.util.*;
public class PrimeNumber2 {
    static{
        System.out.println("Enter postive integer to check prime number or not in command line arguments: ");
  }
  public static void main(String[] args) {
      int num=Integer.parseInt(args[0]);
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
