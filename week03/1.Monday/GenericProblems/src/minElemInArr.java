
public class minElemInArr {
	
	public interface Comparable<T> {
		public int compareTo (T o);
	}
	
	public static <T extends Comparable<T>> T findMin(T[] arr) {
		T min = arr[0];
		
		for (int i = 0; i < arr.length; i++)
			if (arr[i].compareTo(min) < 0)
				min = arr[i];
		
		return min;		
	}
}