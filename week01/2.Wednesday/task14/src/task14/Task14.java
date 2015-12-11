package task14;

import java.util.Scanner;

public class Task14 {
	
	public static int maxSpan (int[] numbers)
	{
		int size = numbers.length;
		int current = 0, max = 0;
		boolean found = false;
		for (int i = 0; i < size; i++)
		{	
			for (int j = size - 1; j > i; j--)
			{
				if (numbers[i] == numbers[j])
				{
					current = j - i + 1;
					found = true;
				}
				
				if (found)
					break;
			}
			
			if (max < current)
				max = current;
		}
		
		return max;
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
		
		System.out.println("The max span of the arr is:");
		System.out.println(maxSpan(arr));
		
		s.close();
	}

}
