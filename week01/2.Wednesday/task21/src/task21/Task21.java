package task21;

import java.util.Scanner;

public class Task21 {
	public static String copyEveryChar(String input, int k) {
		String res = "";
		for (int i = 0; i < input.length(); i++)
			for (int j = 0; j < k; j++)
				res += input.charAt(i);
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = s.nextLine();
		System.out.println("Enter a number:");
		int k = s.nextInt();
		System.out.println(copyEveryChar(input, k));
		s.close();
	}

}
