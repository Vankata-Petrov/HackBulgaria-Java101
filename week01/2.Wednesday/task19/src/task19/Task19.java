package task19;

import java.util.Scanner;

public class Task19 {
	public static boolean isPalindrome (String argument) {
		int i, j;
		int size = argument.length();
		for (i = 0, j = size-1; i < size/2 && j > size/2; i++, j--) 
		{
			if (argument.charAt(i) == argument.charAt(j))	
				continue;
			else
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String arg = s.nextLine();
		System.out.println(isPalindrome(arg));
		s.close();
	}

}
