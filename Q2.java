public class Q2
{	
	public static void main(String[] args)
	{
		int x=5;
		int y=10;		
		System.out.println(" Value of X : " + x + " Value of y : " + y + " before swapping");
		swap(x,y);
	}
	private static void swap(int x,int y)
	{		
		int temp = x;
		x = y;
		y = temp;
		System.out.println(" Value of X : " + x + " Value of y : " + y + " after swapping");
		
	}
}