package task09;

import java.util.Scanner;

public class Task09 {
	public static int countDigits (long N) 
	{
		int count = 0;
		while (N > 0) 
		{
			N = N/10;
			count++;
		}
		
		return count;
	}
	
	public static boolean isPalindrome (long N) 
	{
		int size = countDigits(N);
		while (size > 0) 
		{
			if ( (N % 10) == (int) (N / Math.pow(10, size-1)) ) 
			{
				N = (long) ((N % Math.pow(10, size-1)) / 10);
				size = size - 2;
			}
			else 
				return false;
		}
		
		return true;
	}
	
	public static long getLargestPalindrome (long N) 
	{
		for (long i = N; i >= 0; i--) 
			if(isPalindrome(i)) 
				return i;
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number:");
		long N = s.nextLong();
		
		System.out.println("The largest palindrome < " + N + " is:");
		System.out.println(getLargestPalindrome(N));
		s.close();
	}

}
