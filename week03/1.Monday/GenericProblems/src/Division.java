
public class Division {
	public static <T1 extends Number, T2 extends Number> double sum (T1 l, T2 r) {
		if (r.doubleValue() == 0.0) {
			System.out.println("You can NOT division by 0.");
			return 0;
		}
		
		return l.doubleValue() / r.doubleValue();
	}
}
