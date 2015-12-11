package task20;

import java.util.Scanner;

public class Task20 {
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
		while (size != 1) 
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		System.out.println("Checking if " + n + " is a palindrome...");
		System.out.println(isPalindrome(n));
		s.close();
	}

}
