package task27;

import java.util.Scanner;

public class Task27 {
	public static boolean hasAnagramOf (String A, String B)
	{
		if (A.length() > B.length())
			return false;
		
		StringBuilder a = new StringBuilder(A.toLowerCase().trim());
		StringBuilder b = new StringBuilder(B.toLowerCase().trim());	
		
		char[] bArr = B.toCharArray();
		
		
		int count = 0;    
		for (int i = 0; i < a.length(); i++)
		{
			for (int j = 0; j < b.length(); j++)
				if (a.charAt(i) == bArr[j])
				{
					count++;
					bArr[j] = '0';
					break;
				}
		
			if (count == a.length())
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String first = s.nextLine();
		System.out.println("Enter another string:");
		String second = s.nextLine();
		System.out.println("Is an anagram of String A a SUBSEQUENCE in B?");
		System.out.println(hasAnagramOf(first, second));
		s.close();
	}

}
