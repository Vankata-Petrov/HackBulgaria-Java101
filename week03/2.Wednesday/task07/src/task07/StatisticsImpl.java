package task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatisticsImpl implements Statistics {
	private List<Integer> list = new ArrayList<>();
	
	public void add(int number) {
		list.add(number);
	}
	
	public double getMean() {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) 
			sum += list.get(i);
		
		return sum / list.size();
	}
	
	public double getMedian() {
		int[] tmp = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++)
			tmp[i] = list.get(i);
		
		Arrays.sort(tmp);
		
		if (tmp.length % 2 != 0)
			return tmp[tmp.length/2];
		else
			return ( (tmp[tmp.length/2] + tmp[tmp.length/2 - 1]) / 2);
	}
	
	public int getMode() {
		int count = 0, maxCount = 0;
		int mode = 0;
		for (int i = 0; i < list.size() - 1; i++) {	
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					count++;
			}
			
			if (count > maxCount) {
				maxCount = count;
				mode = list.get(i);
			}
		}
		
		return mode;
	}
	
	public int getRange() {
		int min = list.get(0);
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) < min)
				min = list.get(i);
			if (list.get(i) > max)
				max = list.get(i);
		}
		
		return max - min;
	}
}


