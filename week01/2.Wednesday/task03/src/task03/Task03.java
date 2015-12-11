package task03;
import java.util.Scanner;

public class Task03 {
	public static int min(int... array) 
	{
		int min;
		min = array[0];
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i] < min)
				min = array[i];
		}
		
		return min;
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
		
		System.out.println("The min element in the array is: ");
		System.out.println(min(arr));
		s.close();
	}

}
