package task07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatisticsImpl vusi = new StatisticsImpl();
		
		vusi.add(1);
		vusi.add(2);
		vusi.add(4);
		vusi.add(7);
		
		System.out.println(vusi.getMean());
		System.out.println(vusi.getMedian());
		System.out.println(vusi.getMode());
		System.out.println(vusi.getRange());
	}

}
