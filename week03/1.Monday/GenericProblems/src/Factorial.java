
public class Factorial {
	public static <T extends Number> double factorial (T num) {
		long fac = 1;
		for (double i = num.doubleValue(); i >= 2; i--)
		{
			fac *= i;
		}
		
		return fac;
	}
}
