import java.util.Scanner;

class FirstLetterPrinter 
{
	public static void main (String[] args) 
	{
 		Scanner in = new Scanner(System.in);
 		String input = in.nextLine();
		System.out.println(firstLetterPrinter(input));
	}

	static String firstLetterPrinter(String str) 
	{
 		// write your code here
 		String[] array= str.split(" ");
 		char[] result = new char[array.length];
 		int i = 0;

 		for (String s : array)
 		{
 			result[i++] = s.charAt(0);
 		}

 		return new String(result);
 	}
}