import java.util.Arrays;
import java.util.Scanner;
public class Q4 
{
 public static void main(String args[])  
   {  
      String org, rev = ""; // Objects of String class  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      org = sc.nextLine();   
      int length = org.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         rev = rev + org.charAt(i);  
      if (org.equals(rev))  
         System.out.println("Entered value is a palindrome.");  
      else  
         System.out.println("Entered value isn't a palindrome.");   
   }  
}  
