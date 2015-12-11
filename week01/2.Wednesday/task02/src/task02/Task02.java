package task02;
import java.util.Scanner;

public class Task02 {
	public static boolean isPrime(int N) 
	{
		if (N == 2) return true;
		for (int i = 2; i < N; i++) 
		{
			if (N % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number = s.nextInt();
		System.out.println("Is " + number + " prime?");
		System.out.println(isPrime(number));
		s.close();
	}

}
