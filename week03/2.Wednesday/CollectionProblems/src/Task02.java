import java.util.Collection;

public class Task02<T> {

	Collection<T> collection;
	
	@SuppressWarnings("unchecked")
	static <T> void reverse (Collection<T> collection) {
		Object[] tmp = collection.toArray();
		collection.clear();
		
		for (int i = tmp.length - 1; i >= 0; i--)
			collection.add((T) tmp[i]);	
	}
}
