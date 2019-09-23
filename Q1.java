public class Q1
{
	public static void main (String[] args)
	{
		int x=5;
		int y=10;
		System.out.println(" Value of X : " + x + " Value of y : " + y + " before swapping");
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(" Value of X : " + x + " Value of y : " + y + " after swapping");
	}
}