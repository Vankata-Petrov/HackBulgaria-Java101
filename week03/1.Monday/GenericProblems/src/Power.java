
public class Power {
	public static <T1 extends Number, T2 extends Number> double sum (T1 pwr, T2 exp) {
		return Math.pow(pwr.doubleValue(), exp.doubleValue());
	}
}
