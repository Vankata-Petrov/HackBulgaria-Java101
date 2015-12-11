package task28;

public class DoublyLinkedListImpl implements DoublyLinkedList {
	class Node {
		int value;
		Node prev;
		Node next;
		
		Node() {
			value = 0;
			prev = null;
			next = null;
		}
		
		Node(int value , Node prev, Node next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
	
	private Node Head;
	private Node Tail;
	private int size;
	
	public DoublyLinkedListImpl() {
		Head = null;
		Tail = null;
	}
	
	public void addHead (int element) {
		if (size == 0) {
			Node temp = new Node(element, null, null);
			Head = temp;
			Tail = temp;
			size++;
		}
		else {
			Node temp = new Node(element, null, Head);
			Head.prev = temp;
			Head = temp;
			size++;
		}
	}
	
	public void addTail (int element) {
		if (size == 0) {
			Node temp = new Node(element, null, null);
			Head = temp;
			Tail = temp;
			size++;
		}
		else {
			Node temp = new Node(element, Tail, null);
			Tail.next = temp;
			Tail = temp;
			size++;
		}
	}
	
	public void removeHead() {
		if (size == 0)
			System.out.println("The list is empty, so we can't remove anything.");
		
		else if (size == 1) {
			Head = null;
			Tail = null;
			size--;
		}
		
		else {
			Head.next.prev = null;
			Head = Head.next;
			size--;
		}
	}
	
	public void removeTail() {
		if (size == 0)
			System.out.println("The list is empty, so we can't remove anything.");
		
		else if (size == 1) {
			Head = null;
			Tail = null;
			size--;
		}
		
		else {
			Tail.prev.next = null;
			Tail = Tail.prev;
			size--;
		}
	}
	
	public int getHead() {
		if (size != 0) 
			return Head.value;
		else
			return 0;
	}
	
	public int getTail() {
		if (size != 0)
			return Tail.value;
		else
			return 0;
	}
	
	//helper function for finding element at specific position
	public Node findAt(int index) {
		Node curr = Head;
		int count = 0;
		while (count != index) {
			curr = curr.next;
			count++;
		}
		
		return curr;
	}
	
	public void insertAt (int element, int index) {
		if (index > size) {
			System.out.println("The index is bigger than list's size.");
			return;
		}
		
		else if (index == 0) this.addHead(element);
		else if (index == size) this.addTail(element);
		else {
			Node temp = new Node(element, null, null);
			Node curr = this.findAt(index - 1);
			
			temp.prev = curr;
			temp.next = curr.next;
			curr.next = temp;
			temp.next.prev = temp;
			
			size++;
		}
	}
	
	public int getAt (int index) {
		if (index > size) {
			System.out.println("This index is out of bounds.");
			return 0;
		}
		
		Node curr = this.findAt(index);
		return curr.value;
	}
	
	public void removeAt (int index) {
		if (index > size) System.out.println("This index is out of bounds.");
		else if (index == 0) this.removeHead();
		else if (index == size - 1) this.removeTail();
		else {
			Node curr = this.findAt(index);
			
			curr.prev.next = curr.next;
			curr.next.prev = curr.prev;
			size--;
		}
	}
	
	public int size() {
		return size;
	}
		
	public void clear() {
		while (Head != null) {
			this.removeHead();
		}
	}
	
}
