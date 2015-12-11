package task20;

public class Task20 {
	
	public static int maxEqualConsecutive (int[] items)
	{
		int count = 1, max = 0;
		for (int i = 1; i < items.length; i++)
		{
			if(items[i] == items[i-1])
				count++;
			else if (max < count)
					{
						max = count;
						//res count
						count = 1;
					}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1, 2, 3, 3, 3, 3, 4, 3, 3};
		System.out.println(maxEqualConsecutive(test));
		int[] test2 = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
		System.out.println(maxEqualConsecutive(test2));
		int[] test3 = {1,2};
		System.out.println(maxEqualConsecutive(test3));
	}

}
