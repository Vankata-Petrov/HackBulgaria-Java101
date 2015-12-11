package task26;

public class StackImpl<T> implements Stack<T> {
	private class Node {
		private T value;
		private Node next;
		
		private Node() {
			value = null;
			next = null;
		}
		
		private Node(T value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	
	private Node Head;
	private int size;
	
	public StackImpl() {
		Head = null;
		size = 0;
	}
	
	public void push (T element) {
		if (!(this.contains(element))) {	
			Node temp = new Node(element, Head);
			Head = temp;
			size++;
		}
		else
			System.out.println("Our stack has already contains " + element + ".");
	}
	
	public T pop() {
		if (size != 0) {
			Node temp = Head;
			Head = Head.next;
			size--;
			return temp.value;
		}
		else if (size == 1) {
			Node temp = Head;
			Head = null;
			return temp.value;
		}
		else {
			System.out.println("The stack is empty.");
			return null;
		}
	}
	
	public T top() {
		if (!isEmpty())	
			return Head.value;
		else 
			return null;
	}
	
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		while (size != 0)
			this.pop();
	}
	
	
	public boolean contains (T element) {
		Node curr = Head;
		while (curr != null) {
			if (curr.value.equals(element))
				return true;
			
			curr = curr.next;
		}
		
		return false;
	}
}
