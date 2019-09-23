public class Q3
{
	public static void main(String args[]) 
    { 
        String w = "HelloJava"; 
        char[] ch = w.toCharArray();
		System.out.println("Display charcters in array");		
		for (int i = 0; i < ch.length; i++) { 
            System.out.print(ch[i]+ ", "); 
        } 
		System.out.println("");
		System.out.println("");
		System.out.println("Display charcters in array in reverse");
		for (int i = (ch.length-1); i >=0; i--) { 
            System.out.print(ch[i]+ ", "); 
        } 
    } 
}