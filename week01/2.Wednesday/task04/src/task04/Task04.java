package task04;
import java.util.Scanner;

public class Task04 {
	public static int kthMin(int k, int arr[]) 
	{
		int size = arr.length;
		for (int i = 0; i < size - 1 && i <= k; i++) 
		{
			int index = i;
			for (int j = i + 1; j < size; j++)
				if (arr[j] < arr[index])
					index = j;
			
			int smallestIndex = arr[index];
			arr[index] = arr[i];
			arr[i] = smallestIndex;
		}
		
		return arr[k];
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
		
		System.out.println("Enter kth position:");
		int k = s.nextInt();
		
		System.out.println("The " + k + "th min element of the array is:");
		System.out.println(kthMin(k, arr));  
		s.close();
	}

}
