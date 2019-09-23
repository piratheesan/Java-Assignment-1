import java.util.Scanner; 

class Q11{
public static void main(String args[])
{
	while(true)
	{
		Scanner sc= new Scanner(System.in);
					System.out.println("*************** Menu*****************");
		System.out.println(" |  1.PRINT SQUARE | ");
		System.out.println(" |  2.PRINT RECTANGLE  |");
		System.out.println(" |  3.PRINT CROSS  |");
		System.out.println(" |  4.PRINT PLUS |");
		System.out.println(" |  5.PRINT DIAMOND  |");
		System.out.println(" |  6.To Exit Application |");

		System.out.println("********************************");
		String strchoice =sc.nextLine();
		
		if(strchoice.equalsIgnoreCase("1"))
		{
			System.out.println("*************** SQUARE*****************");
			square();
		}
		else if(strchoice.equalsIgnoreCase("2"))
		{
			System.out.println("*************** RECTANGLE*****************");
			rectangle();
		}

		else if(strchoice.equalsIgnoreCase("3"))
		{
			System.out.println("*************** CROSS*****************");
			cross();
		}

		else if(strchoice.equalsIgnoreCase("4"))
		{
			System.out.println("*************** PLUS*****************");
			plus();
		}

		else if(strchoice.equalsIgnoreCase("5"))
		{
			System.out.println("*************** DIAMOND*****************");
			diamond();
		}


		else if (strchoice.equalsIgnoreCase("6"))
		{
			System.exit(0);
		}
	}
	
	
}
	public static void cross()
	{
		for(int y=1;y<=20;y=y+1)
			
		{
			for(int i=1;i<=20;i=i+1)
			{
				if(i==y || i+y==20)
				{

					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
						
			}

			System.out.println();
		}
	}
		
	public static void square()
	{
		for(int y=1;y<=5;y=y+1)
		
		{
		for(int i=1;i<=5;i=i+1)
		{
			if(i==1 || i==5 || y==1|| y==5)
			{

				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}			
		
		}

		System.out.println();
	}
}

	public static void rectangle()
	{
		for(int y=1;y<=20;y=y+1)
		
		{
			for(int i=1;i<=10;i=i+1)
			{
				if(i==1 || i==10 || y==1|| y==20)
				{

				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
					
			}

			System.out.println();
		}
}


	public static void plus() 
	{

		for(int j = 0; j <= 3; j++) 
		{
			for(int i = 0; i<=5; i++) 
			{
				System.out.print(" ");
			}

			System.out.println("*");
		}

		for(int k = 0; k<=11; k++) 
		{
			System.out.print("*");
		}

		System.out.println();
		for(int j = 0; j <= 3; j++) 
		{

			for(int i = 0; i<=5; i++) 
			{
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}

	public static void diamond() {

		int i, j, k;
		for(i=1;i<=5;i++) 
		{
			for(j=i;j<5;j++) 
			{
				System.out.print(" ");
			}
			for(k=1;k<(i*2);k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=4;i>=1;i--) 
		{
			for(j=5;j>i;j--) 
			{
				System.out.print(" ");
			}
			for(k=1;k<(i*2);k++) 
			{
				System.out.print("*");
			}
				System.out.println();
		}

	}
}
