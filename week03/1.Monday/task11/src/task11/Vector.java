package task11;

public class Vector<T> {
	private T[] arr;
	private int capacity;
	private int size;
	
	public Vector() {
		arr = null;
		capacity = 0;
		size = 0;
	}
	
	public Vector(int size) {	
		this.size = size;
		capacity = this.size * 2;
		arr = new T[this.size];
		
		
	}
}
