package task28;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedListImpl list = new DoublyLinkedListImpl();
		list.addHead(2);
		list.addHead(3);
		list.addHead(123);
		list.addTail(1);
		list.addTail(17);
		list.insertAt(5, 1);
		list.insertAt(10, 6);
		list.insertAt(92, 0);
	
		list.removeAt(3);
		list.insertAt(432, 3);
		System.out.println(list.getAt(4));
		
		//System.out.println(list.getHead());
		//System.out.println(list.getTail());
	}

}
