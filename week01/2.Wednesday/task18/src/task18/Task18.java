package task18;

import java.util.Scanner;

public class Task18 {
	public static String reverseMe (String argument)
	{
		String res = "";
		for (int i = argument.length() - 1; i >= 0; i--)
			res += argument.charAt(i);
		
		return res;
	}
	
	public static String reverseEveryChar (String arg)
	{
		String res = "";
		String[] arr = arg.split(" ");
		for (int i = 0; i < arr.length; i++)
			res += new StringBuffer(reverseMe(arr[i]) + " ");
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		System.out.println(reverseEveryChar(str));
		s.close();
	}

}
