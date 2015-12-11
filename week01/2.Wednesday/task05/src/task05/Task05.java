package task05;

import java.util.Scanner;

public class Task05 {
	public static int getAverage(int[] array) 
	{	
		int sum = 0;
		int size = array.length;
		for (int i = 0; i < size; i++) 
			sum += array[i];

		return (sum / size);
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
		
		System.out.println("The average of the array is:");
		System.out.println(getAverage(arr));
		s.close();
	}

}
