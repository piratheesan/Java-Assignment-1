import java.util.Arrays;
import java.util.Scanner;

public class Q5
{	
	public static void main(String[] args)
	{
		
		String word1,word2;
		boolean check=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word 1  : ");
		word1=sc.nextLine();
		System.out.println("Enter word 2  : ");
		word2=sc.nextLine();
		if(word1.length() !=word2.length())
		{
			System.out.println("Length of two strings are not equal");
		}
		else
		{
			char[] ch = word1.toCharArray();
			char[] ch1 = word2.toCharArray();
			
			for(int i=0; i<word1.length();i++)
			{
				if(ch[i]!= ch1[i])
				{
					check=true;					
				}
						
			}
			if(check!=true)
			{
				System.out.println("Two strings are same");
			}
			else
			{
				System.out.println("Two strings are different");
			}
			
			
		}
	}
}