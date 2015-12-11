package task31;

import java.util.Scanner;

public class Task31 {
	public static int countConsonants(String str)
	{
		char[] consonants = {'b', 'B', 'c', 'C', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H',
				'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'p', 'P', 'q', 'Q',
				'r', 'R', 's', 'S', 't', 'T', 'v', 'V', 'w', 'W', 'x', 'X', 'z', 'Z'};

		char[] temp = str.toCharArray();
		int count = 0;
		for (int i = 0; i < temp.length; i++) 
		{
			for (int j = 0; j < consonants.length; j++)
				if (temp[i] == consonants[j])
					count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		System.out.println("Counting the consontants of your string...");
		System.out.println(countConsonants(str));
		s.close();
	}

}
