package task32;

import java.util.Scanner;

public class Task32 {
	public static int countDigits (int n)
	{
		int count = 0;
		while (n != 0)
		{
			n = n/10;
			count++;
		}
		
		return count;
	}
	
	public static boolean isPalindrome (int n)
	{	
		int size = countDigits(n);
		while (size != 1) 
		{
			if ( (n % 10) == (int) (n / Math.pow(10, size-1)) ) 
			{
				n = (int) ((n % Math.pow(10, size-1)) / 10);
				size = size - 2;
			}
			else 
				return false;
		}
		
		return true;
	}
	
	public static int reverseMe (int n)
	{
		int res = 0;
		int size = countDigits(n);
		while (size != 0)
		{
			res += (int) ((n % 10) * Math.pow(10, size-1));
			n = n / 10;
			size--;
		}
		
		return res;
	}
	
	public static int pScore (int n)
	{
		if (isPalindrome(n))
			return 1;
		
		int s = n + reverseMe(n);
		
		return 1 + pScore(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		System.out.println("The palindrome score of " + num + " is:");
		System.out.println(pScore(num));
		s.close();
	}

}
