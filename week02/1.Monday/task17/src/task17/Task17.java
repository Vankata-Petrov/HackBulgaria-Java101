package task17;

import java.util.Scanner;

public class Task17 {
	public static int fib (int n)
	{
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		
		return fib(n-1) + fib(n-2);
	}
	
	public static long fibNumber(int n)
	{
		long ans;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++)
			sb.append(fib(i));
		
		ans = Long.parseLong(sb.toString());
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		
		System.out.println(fibNumber(n));
		
		s.close();
	}

}
