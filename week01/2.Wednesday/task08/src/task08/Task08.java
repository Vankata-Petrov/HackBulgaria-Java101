package task08;

import java.util.Scanner;

public class Task08 {
	public static long getSmallestMultiple (int upperBound) 
	{
		int[] arr = new int[upperBound];
		for (int i = 0; i < upperBound; i++)
			arr[i] = i+1;
		
		for (long i = 1; ; i++) 
		{
			int count = 0;
			for (int j = 0; j < arr.length; j++)
				if (i % arr[j] == 0)
					count++;
			
			if (count == arr.length)
				return i;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		do 
		{
			System.out.println("Enter an upper bound:");
			n = s.nextInt();
		} while ( (n < 1) );
		
		System.out.println(getSmallestMultiple(n));
		s.close();
	}

}
