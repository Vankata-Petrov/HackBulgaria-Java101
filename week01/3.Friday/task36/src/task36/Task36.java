package task36;

import java.util.Scanner;

public class Task36 {
	public static boolean is_an_bn(String word)
	{
		int size = word.length();
		if (size >= 0)
		{
			if (size % 2 == 0)
			{
				for (int i = 0, j = size - 1; i < size/2 && j >= size/2; i++, j--)
				{
					if (word.charAt(i) == 'a' && word.charAt(j) == 'b')
						continue;
					else
						return false;
				}
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		
		System.out.println("Checking if the word is from the a^nb^n (n >= 0) language:");
		System.out.println(is_an_bn(str));
		s.close();
	}

}
