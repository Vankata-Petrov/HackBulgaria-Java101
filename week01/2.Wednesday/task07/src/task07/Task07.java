package task07;

import java.util.Scanner;

public class Task07 {
	public static long fac (long n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	public static long kthFac(int k, int n) {
		long value = fac(n);
		for (int i = 1; i < k; i++) {
			value = fac(value); 
		}
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("n = ");
		int n = s.nextInt();
		System.out.print("k = ");
		int k = s.nextInt();
		
		System.out.println("Calculating the kth factorial of n:");
		System.out.println(kthFac(k, n));
		s.close();
	}

}
