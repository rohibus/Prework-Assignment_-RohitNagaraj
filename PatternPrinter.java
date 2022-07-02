import java.util.Scanner;

class PatternPrinter 
{
 	public static void main(String[] args) 
 	{
 		Scanner in = new Scanner(System.in);
 		int n = in .nextInt();
 		patternPrinter(n);
 	}

 	static void patternPrinter(int n) 
 	{
 		// write your code here
 		for (int i = n; i > 0; i--)
 		{
 			int temp = n;
 			while (temp > 0)
 			{
 				for (int j = 0; j < i; j++)
 				{
 					System.out.print(temp + " ");
 				}
 				temp--;
 			}
 			System.out.println();
 		}
 	}
}