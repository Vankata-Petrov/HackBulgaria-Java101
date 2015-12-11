package task10;

import java.util.Scanner;

public class Task10 {
	public static int[] histogram (short[][] image) 
	{
		int[] result = new int[256];
		for (int i = 0; i < result.length; i++)
			result[i] = 0;
		
		for (int i = 0; i < image.length; i++)
			for (short var : image[i])
				result[var]++; 
		
		for (int i = 0; i < result.length; i++)
			if (result[i] != 0)
				System.out.println("Element " + i + " : " + result[i] + " times");
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int row, col;
		
		do
		{
			System.out.println("Enter a number for rows:");
			row = s.nextInt();
			System.out.println("Enter a number for columns:");
			col = s.nextInt();
		} while ( (row < 1) || (col < 1) );
		
		short[][] img = new short[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
			{
				System.out.println("Enter img[" + i + "][" + j + "]: ");
				img[i][j] = s.nextShort();
			}
		
		System.out.println("Printing the historgram:");
		histogram(img);
		s.close();
	}

}
