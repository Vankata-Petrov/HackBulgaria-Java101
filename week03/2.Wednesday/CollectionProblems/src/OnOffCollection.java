import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class OnOffCollection<E> implements Collection<E> {

    private ArrayList<E> collection;
	
    public OnOffCollection(Collection<E> collection){
        this.collection= new ArrayList<E>((Collection<? extends E>) Arrays.asList(collection.toArray()));
    }
    
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		
		if (collection.contains(e)) {
			collection.remove(e);
			return false;
		}
		
		return collection.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return collection.addAll(c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		collection.clear();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return collection.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return collection.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return collection.size()==0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return collection.iterator();
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return collection.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return collection.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return collection.retainAll(c);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return collection.size();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return collection.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return collection.toArray(a);
	}
	
	//Creating a print method for our class
	public void print() {
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.toString());
			iterator.next();
		}
	}
}
