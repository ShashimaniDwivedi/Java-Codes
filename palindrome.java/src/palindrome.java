import java.util.Scanner;

public class palindrome
{
 public static void palinCheck() {
  System.out.print("Enter String : ");
  Scanner sc=new Scanner(System.in);
  String str1 =sc.next().toUpperCase();
  String str2 = "";
  for (int i = str1.length() - 1; i >= 0; i--) {
   str2 += str1.charAt(i);
  }
  if(str1.equals(str2))
  {
   System.out.println("String is Palindrome");
  }
  else {
   System.out.println("String is not Palindrome");
  }
 }
  public static void main(String[] args)
  {
   palinCheck();
  }
}