import java.util.ArrayList;
import java.util.Collection;

public class Task05<T> {
	public static <T> T firstUniqueElem (Collection<T> collection) {
		T[] helper = (T[]) collection.toArray();
		ArrayList<T> visited = new ArrayList<>();
		
		for (int i = 0; i < helper.length - 1; i++) {
			
			for (int j = i + 1; j < helper.length; j++) {
				if(helper[i].equals(helper[j]) && ! (visited.contains(helper[i]))) {
					visited.add(helper[i]);
					break;
				}
			}
			
			if (!(visited.contains(helper[i]))) {
				System.out.println("The unique elements is:");
				return helper[i];
			}
		}
		
		System.out.println("There are NO unique elements in your collection.");
		return null;
	}
}
