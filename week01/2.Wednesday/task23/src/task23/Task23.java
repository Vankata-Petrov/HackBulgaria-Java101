package task23;

import java.util.Scanner;

public class Task23 {
	public static int countOccurences(String needle, String haystack) 
	{
		int count = 0, j = 0;
		
		for (int i = 0; i < haystack.length(); i++) 
			if (haystack.charAt(i) == needle.charAt(j)) 
			{
				j++;
				if (j == needle.length() - 1) 
				{
					count++;
					j = 0;
				}
			}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a needle string:");
		String needle = s.nextLine();
		System.out.println("Enter a haystack string:");
		String haystack = s.nextLine();
		System.out.println(countOccurences(needle, haystack));
		s.close();
	}

}
