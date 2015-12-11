package task21;

public class Task21 {

	public static int maxIncreasingConsecutive(int[] items)
	{
		int count = 1;
		int max = 0;
		for (int i = 1; i < items.length; i++)
		{
			if (items[i-1] <= items[i])
				count++;
			
			else if (max < count)
			{
				max = count;
				count = 1;
			}
		}
		
		if (count == items.length)
			max = count;
		
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1, 2, 3, 3, 3, 3, 4, 3, 3};
		System.out.println(maxIncreasingConsecutive(test));
		int[] test2 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		System.out.println(maxIncreasingConsecutive(test2));
		int[] test3 = {1,2,3,4,5};
		System.out.println(maxIncreasingConsecutive(test3));
		
	}

}
