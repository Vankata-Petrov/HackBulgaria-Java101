package task26;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl<Integer> stack = new StackImpl<>();
		
		stack.push(5);
		stack.push(7);
		stack.push(5);
		
		System.out.println(stack.top());
	}

}
