package task35;

import java.util.Scanner;

public class Task35 {
	public static boolean is_credit_card_valid(String number)
	{
		if (number.length() % 2 == 0)
			return false;
		else
		{	
			int[] res = new int[number.length()];
			for (int i = 0; i < number.length(); i++)
				res[i] = number.charAt(i) - '0';
			
			for (int i = res.length - 2; i >= 0; i -= 2)
				res[i] = 2 * res[i];
			
			int sum = 0;
			for (int i = 0; i < res.length; i++)
				sum += res[i];
			
			if (sum % 10 == 0)
				return true;
			else
				return false;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a credit card number:");
		String str = s.nextLine();
		
		System.out.println("Checking if the credit card's valid:");
		System.out.println(is_credit_card_valid(str));
		s.close();
	}

}
