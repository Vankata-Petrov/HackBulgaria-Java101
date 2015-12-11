package task18;

public class Task18 {
	public static int nthLucas(int n)
	{
		if (n == 0) return 2;
		if (n == 1) return 1;
		return nthLucas(n-1) + nthLucas(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nthLucas(3));
	}

}
