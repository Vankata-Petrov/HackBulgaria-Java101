package task29;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListStack stack = new ListStack();
		stack.push(5);
		stack.push(123);
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.top());
	}

}
