# palindrome-no
import java.io.*;
import java.util.*;
public class Palindromeno
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int b,a,rem;
    int reverse=0;
    System.out.println("Enter the integer");
    b=sc.nextInt();
     a=b;
    while(a!=0)
    {
      rem=a%10;
      reverse=reverse*10+rem;
      a=a/10;
    }
    if(b==reverse)
    {
      System.out.println("The given integer is palindrome");
    }
    else
    {
      System.out.println("the given integer is not palindrome");
    }
  }
}
