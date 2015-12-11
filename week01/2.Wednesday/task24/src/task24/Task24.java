package task24;

import java.util.Scanner;

public class Task24 {
	public static String decodeUrl(String input)
	{
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == '%')
			{
				if (input.substring(i, i+3).equals("%20"))
				{
					res.append(' ');
					i = i + 2;
				}
				if (input.substring(i, i+3).equals("%3A"))
				{
					res.append(':');
					i = i + 2;
				}
				if (input.substring(i, i+3).equals("%3D"))
				{
					res.append('?');
					i = i + 2;
				}
				if (input.substring(i, i+3).equals("%2F"))
				{
					res.append('/');
					i = i + 2;
				}
			}
			
			else
				res.append(input.charAt(i));
		}
		
		return res.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		System.out.println(decodeUrl(str));
		s.close();
	}

}
