import java.util.Scanner;
public class Q9{
	
public static void main(String args[])
{
	int array[]={9,2,1,4,5,2,1,9,3,4};	
	int count=0;
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+ ", ");		
	}
	System.out.print("\n");
	for(int i=0;i<array.length;i++) 
	{
		int j;		
		for(j=0;j<array.length;j++) 
		{
			if(array[i] == array[j]) 
			{
				break;
			}
		}
		if(i == j) 
		{								
			for(int m=0; m<array.length; m++) 
			{
				if(array[i] == array[m]) 
				{
					count = count + 1;
				}
			}
			
			System.out.println("Number "+ array[i] + "->" + " No of occurence -> " + count);
			count = 0;
		}
	}
}
}
