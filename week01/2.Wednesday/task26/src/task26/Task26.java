package task26;

import java.util.Scanner;

public class Task26 {
	public static boolean anagram (String A, String B)
	{	
		
		if (A.length() != B.length())
			return false;
	
		int size = A.length();
		
		StringBuilder a = new StringBuilder(A.toLowerCase().trim());
		StringBuilder b = new StringBuilder(B.toLowerCase().trim());
		
		int count = 0;
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				if (a.charAt(i) == b.charAt(j))
				{
					count++;
					break;
				}
		
		if (count == size)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String first = s.nextLine();
		System.out.println("Enter another string:");
		String second = s.nextLine();
		System.out.println("Is string A an anagram of B?");
		System.out.println(anagram (first, second));
		s.close();
	}

}
