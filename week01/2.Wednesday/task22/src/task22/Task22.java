package task22;

import java.util.Scanner;

public class Task22 {
	public static int getPalindromeLength(String input) 
	{
		int star_idx = 0;
		for (int i = 0; i < input.length(); i++) 
			if (input.charAt(i) == '*')
				star_idx = i;

		int i, j;
		int count = 0;
		for (i = star_idx-1, j = star_idx+1; i >= 0 && j < input.length();  i--, j++)
			if (input.charAt(i) == input.charAt(j))
				count++;
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = s.nextLine();
		System.out.println(getPalindromeLength(input));
		s.close();
	}

}
