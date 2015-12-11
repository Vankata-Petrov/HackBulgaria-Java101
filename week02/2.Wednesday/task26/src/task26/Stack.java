package task26;

public interface Stack<T> {
	public void push (T element);
	public T pop();
	public T top();
	
	public boolean isEmpty();
	public int size();
	public void clear();
	
	public boolean contains (T element);
}
