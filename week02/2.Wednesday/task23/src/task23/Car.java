package task23;

public abstract class Car {
	public abstract boolean isEcoFriendly(boolean testing);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a = new Audi();
		a.setAge(3);
		System.out.println(a.getAge());	
	}

}
