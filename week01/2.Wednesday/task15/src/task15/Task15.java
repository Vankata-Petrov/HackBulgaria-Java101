package task15;

import java.util.Scanner;

public class Task15 {
	public static boolean canBalance (int[] numbers) {
		int i, j;
		int sum1 = 0, sum2 = 0;
		for (i = 0, j = numbers.length - 1; i <= j; ) 
		{
			if (sum1 == sum2) 
			{
				sum1 += numbers[i++];
				sum2 += numbers[j--];
				if (i-2 == j && sum1 == sum2)
					 return false;
			}
			
			else if (sum1 < sum2)
				sum1 += numbers[i++];

			else if (sum1 > sum2)
				sum2 += numbers[j--];
		}
		
		return sum1 == sum2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		do
		{
			System.out.println("Enter the size of the array: ");
			n = s.nextInt();
		} while ( n < 1 );
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = s.nextInt();
		}
		
		System.out.println("Can balance?");
		System.out.println(canBalance(arr));
		s.close();
	}

}
