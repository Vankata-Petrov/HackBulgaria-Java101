package task01;
import java.util.Scanner;

public class Task01 {
	public static boolean isOdd(int n) 
	{
		return n % 2 != 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number:");
		int number = s.nextInt();
		System.out.println("Is " + number + " odd?");
		System.out.println(isOdd(number));
		s.close();
	}
}
