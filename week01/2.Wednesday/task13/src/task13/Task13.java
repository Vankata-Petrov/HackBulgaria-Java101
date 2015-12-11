package task13;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
	public static long maximalScalarSum (int[] a, int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i]*b[i];
		
		long res = (long) sum;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter the size of the vectors:");
			n = s.nextInt();
		} while ( n < 1 );
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter a[" + i + "]: ");
			a[i] = s.nextInt();
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter b[" + i + "]: ");
			b[i] = s.nextInt();
		}
	
		System.out.println("The max scalar sum of vectors a and b is: ");
		System.out.println(maximalScalarSum(a, b));
		s.close();
	}

}
