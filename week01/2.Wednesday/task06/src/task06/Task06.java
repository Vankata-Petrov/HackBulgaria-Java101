package task06;
import java.util.Scanner;

public class Task06 {
	public static long doubleFac(int n)
	{
		int factorial = 1;
		for (int i = 1; i <= n; i++)
			factorial = factorial * i;
		
		int currFac = factorial;
		for (int j = 1; j < currFac; j++)
			factorial = factorial * j;

		return factorial;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		System.out.println(doubleFac(n));
		s.close();
	}

}
