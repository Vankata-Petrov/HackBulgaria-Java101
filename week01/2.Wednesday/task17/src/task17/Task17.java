package task17;

import java.util.Scanner;

public class Task17 {	
	public static String reverseMe (String argument)
	{
		String res = "";
		for (int i = argument.length() - 1; i >= 0; i--)
			res += argument.charAt(i);
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String arg = s.nextLine();	
		System.out.println(reverseMe(arg));
		s.close();	
	}

}
