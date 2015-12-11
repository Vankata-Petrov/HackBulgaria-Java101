package task30;

import java.util.Scanner;

public class Task30 {
	public static int countVowels(String str)
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y',
				        'A', 'E', 'I', 'O', 'U', 'Y'};
		
		char[] temp = str.toCharArray();
		int count = 0;
		for (int i = 0; i < temp.length; i++) 
		{
			for (int j = 0; j < vowels.length; j++)
				if (temp[i] == vowels[j])
					count++;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		System.out.println("Counting the vowels of your string...");
		System.out.println(countVowels(str));
		s.close();
	}

}
