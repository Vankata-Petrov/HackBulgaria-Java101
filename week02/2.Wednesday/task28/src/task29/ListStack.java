package task29;

import task28.DoublyLinkedListImpl;

public class ListStack {
	private DoublyLinkedListImpl myStack = new DoublyLinkedListImpl();
	
	public void push (int element) {
		myStack.addHead(element);
	}
	
	public void pop() {
		myStack.removeHead();
	}
	
	public int top() {
		return myStack.getHead();
	}
	
	public boolean isEmpty() {
		if (myStack.size() != 0)
			return false;
		else
			return true;
	}
	
	public int size() {
		return myStack.size();
	}
	
	public void clear() {
		myStack.clear();
	}
	
}
