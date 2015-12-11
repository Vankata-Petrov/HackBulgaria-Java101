package task19;

public class Task19 {
	public static boolean IsIncreasing(int[] sequence)
	{
		for (int i = 1; i < sequence.length; i++)
			if (!(sequence[i-1] < sequence[i]))
				return false;
		
		return true;
	}
	
	public static boolean IsDecreasing(int[] sequence)
	{
		for (int i = 1; i < sequence.length; i++)
			if (!(sequence[i-1] > sequence[i]))
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1,2,3};
		int[] test2 = {3,2,1,5};
		System.out.println(IsIncreasing(test));
		System.out.println(IsDecreasing(test2));
	}

}
