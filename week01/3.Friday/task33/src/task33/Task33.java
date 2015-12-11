package task33;

public class Task33 {
	
	private static StringBuilder res = new StringBuilder();
	private static boolean capital = false;
	
	public static int countSequence (int arr[], int pos) {
		int count = 1;
		while (pos != arr.length-1 && arr[pos] == arr[pos+1]) {
			count++;
			pos++;
		}
		
		return count;
	}
	
	public static int putLetter(int[] numbers, int i, String letters) {
		int count = 1;
		count = countSequence(numbers, i);
		if (capital) {
			char tmp = Character.toUpperCase(letters.charAt((count-1) % letters.length()));
			res.append(tmp);
		}
		else 
			res.append(letters.charAt((count-1) % letters.length()));
		capital = false;
		i += count;
		
		return i;
	}
	
	public static String numberToMessage (int[] numbers) {
		
		for (int i = 0; i <  numbers.length; ) {
			if (numbers[i] == 0) {
				res.append(" ");
				i++;
			}
			
			if (numbers[i] == 1)
				capital = true;
			
			switch (numbers[i]) {
				case 2: i = putLetter(numbers, i, "abc"); break;
				case 3: i = putLetter(numbers, i, "def"); break;
				case 4: i = putLetter(numbers, i, "ghi"); break;
				case 5: i = putLetter(numbers, i, "jkl"); break;
				case 6: i = putLetter(numbers, i, "mno"); break;
				case 7: i = putLetter(numbers, i, "pqrs"); break;
				case 8: i = putLetter(numbers, i, "tuv"); break;
				case 9: i = putLetter(numbers, i, "wxyz"); break;
				default: i += 1; break;
			}
		}
		
		return res.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 };
		System.out.println(numberToMessage(numbers));
	}
}
