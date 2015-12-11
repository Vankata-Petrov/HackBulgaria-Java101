package task28;

public interface DoublyLinkedList {
	public void addHead (int element);
	public void addTail (int element);
	
	public void removeHead();
	public void removeTail();
	
	public int getHead();
	public int getTail();

	public void insertAt (int element, int index);
	public int getAt (int index);
	public void removeAt (int index);
	
	public int size();
	public void clear();
}

