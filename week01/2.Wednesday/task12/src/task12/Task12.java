package task12;

import java.util.Scanner;

public class Task12 {
	public static int getOddOccurences(int... array) 
	{	
		int max = array[0];
		for (int i = 0; i < array.length; i++)
			if (array[i] > max)
				max = array[i];
		
		int[] counts = new int[max+1];
		for (int i = 0; i < counts.length; i++)
			counts[i] = 0;
		
		for (int i = 0; i < array.length; i++)
			counts[array[i]]++;
		
		int odd = 0;
		for (int i = 0; i < counts.length; i++) 
			if (counts[i] % 2 != 0)
				odd = i;
		
		return odd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n;
		do
		{
			System.out.println("Enter the size of the array:");
			n = s.nextInt();
		} while ( n < 1 );
		
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter arr[" + i + "]: ");
			arr[i] = s.nextInt();
		}
		
		System.out.println("Finding the number, that occurs odd times in the array: ");
		System.out.println(getOddOccurences(arr));
		s.close();
	}

}
