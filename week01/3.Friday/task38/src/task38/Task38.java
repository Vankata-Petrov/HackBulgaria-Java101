package task38;

import java.util.Scanner;

public class Task38 {
	
	public static int countDigits(int n)
	{
		int count = 0;
		while (n != 0)
		{
			n = n / 10;
			count++;
		}
		
		return count;
	}
	
	public static int zero_insert(int n)
	{		
		int[] temp = new int[countDigits(n)];
		for (int i = temp.length - 1; i >= 0; i--)
		{
			temp[i] = n % 10;
			n = n / 10;
		}
		
		int[] zero_arr = new int[2*temp.length-1];
		int j = 0;
		for (int i = 0; i < temp.length - 1; i++)
		{
			if ((temp[i] == temp[i+1]) || ((temp[i] + temp[i+1]) % 10 == 0))
			{	
				zero_arr[j++] = temp[i];
				zero_arr[j++] = 0;
			}
			else 
				zero_arr[j++] = temp[i];	
		}
		
		zero_arr[j++] = temp[temp.length - 1];
		
		StringBuilder strNum = new StringBuilder();
		
		for (int i = 0; i < j; i++)
			strNum.append(zero_arr[i]);
		
		int finalInt = Integer.parseInt(strNum.toString());
		
		return finalInt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		System.out.println(zero_insert(num));
		s.close();
	}

}
