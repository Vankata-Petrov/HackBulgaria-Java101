import java.util.Stack;

public class Task01 {

	/*public static boolean checkBrackets (String input)
	{
		int size = input.length();
		if ( ! ((input.charAt(0) == '(') && (input.charAt(size-1) == ')')) )
			return false;
		
		int count = 0;
		for (int i = 0; i < size; i++)
		{
			if (input.charAt(i) == '(')
				count++;
			else if (input.charAt(i) == ')')
				count--;
			if (count < 0)
				return false;
		}
		
		if (count == 0)
			return true;
		else
			return false;
	}*/

	public static boolean checkBrackets (String input) {
		int size = input.length();
		if ( ! ((input.charAt(0) == '(') && (input.charAt(size-1) == ')')) )
			return false;
		
		Stack<Character> myStack = new Stack<>();
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '(')
				myStack.push('(');
			else if (myStack.empty())
				return false;
			else if (myStack.pop() != '(')
				return false;
		}
		
		return true;
		
	}
	
	
}
