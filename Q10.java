class Q10
{
	public static void main(String args[])

	{
		String [][] a={{"Name ","Age","Address"},{"Pirathee","25","Jaffna "},{"Kajan","25","Jaffna"},{"Thenujan","25","colombo"}};
		print2dimarray(a);
	}

	public static void print2dimarray(String[][] arr)
	{
		System.out.println("==========================================================");
		for(int r=0; r<arr.length; r++)
		{
			for(int col = 0; col < arr[r].length; col++) {
				System.out.print("| \t" + arr[r][col] + " \t ");
			}
			System.out.print("|");
			System.out.println();
			if(r == 0) {
				System.out.println("==========================================================");
			}
		}		
		System.out.println("==========================================================");
	}
}