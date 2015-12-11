import java.util.Collection;

public class Task04<T> {
	
	@SuppressWarnings("unchecked")
	public static <T> void rotate(Collection<T> collection, int rotateStep) {
		if (rotateStep == 0) 
			System.out.println("The collection remains the same.");
		
		Object[] tmp = collection.toArray();
		collection.clear();
		
		if (rotateStep > 0) {
			rotateStep %= tmp.length;
			
			for (int i = tmp.length - rotateStep; i < tmp.length; i++)
				collection.add((T)tmp[i]);
		
			for (int i = 0; i <= tmp.length - rotateStep - 1; i++)
				collection.add((T)tmp[i]);
		}
		
		else {
			rotateStep = rotateStep % tmp.length;
			
			for (int i = - rotateStep; i < tmp.length; i++)
				collection.add((T)tmp[i]);
		
			for (int i = 0; i < - rotateStep; i++)
				collection.add((T)tmp[i]);
		}
	}
}
