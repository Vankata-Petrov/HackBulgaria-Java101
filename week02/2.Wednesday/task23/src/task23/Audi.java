package task23;

public class Audi extends Car {
	private int mileage = 0;
	
	@Override
	public boolean isEcoFriendly(boolean testing)
	{
		return true;
	}
	
	public void setAge (int mileage)
	{
		this.mileage = mileage;
	}
	
	public int getAge ()
	{
		return this.mileage;
	}
}
