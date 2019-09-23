import java.util.*;

class Q7 {

	public static void main(String args[]) {
	
		print(1,4);

	}
	
	public static void print( int index1, int index2) {
		
		int[] array = {9,3,6,1,5,2,2};
		
		System.out.print("Before Swaping the array elements: ");
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(" " + array[i]);
		}
		
		System.out.println();
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
		System.out.print("After Swap: ");
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(" " + array[i]);
		}
		
		
	}

}


