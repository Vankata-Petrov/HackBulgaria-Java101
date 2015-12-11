package task29;

import java.util.Scanner;

public class Task29 {
	public static boolean isHack (int n)
	{
		int max_size = 50;
		int[] res = new int[max_size];
		int size = 0;
		while (n > 0)
		{
			res[size] = n % 2;
			n = n / 2;
			size++;
		}
		
		int count = 0;
		for (int i = 0; i < (size / 2); i++)
		{
			//count the digits equals to 1
			if (res[i] == 1)
				count += 2;
			if (res[i] == res[size-1-i])
				continue;
			else
				return false;
		}
		
		if (size % 2 != 0 && res[size / 2] == 1)
			count++;
		
		if (count % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static int nextHack (int n)
	{
		for (int i = n; ; i++)
			if (isHack(i))
				return i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		System.out.println("Is " + num + " a hack number?");
		System.out.println(isHack(num));
		
		System.out.println("Enter another number:");
		int next = s.nextInt();
		System.out.println("The next hack number, bigger than " + next + ", is:");
		System.out.println(nextHack(next));
		
		s.close();
	}

}
