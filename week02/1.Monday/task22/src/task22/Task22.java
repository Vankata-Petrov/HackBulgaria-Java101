package task22;

import java.util.ArrayList;

public class Task22 {
	
	public static int uniqueWordsCount(String[] arr)
	{
		ArrayList<String> res = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++)
			if(!res.contains(arr[i]))
				res.add(arr[i]);
		
		return res.size();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"apple", "banana", "apple", "pie"};
		System.out.println(uniqueWordsCount(arr));
		String[] arr2 = {"java", "java", "java", "android"};
		System.out.println(uniqueWordsCount(arr2));
		String[] arr3 = {"hello", "hello", "hello", "hello"};
		System.out.println(uniqueWordsCount(arr3));
	}

}
