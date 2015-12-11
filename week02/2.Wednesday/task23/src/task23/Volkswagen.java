package task23;

public class Volkswagen extends Car {
	@Override
	public boolean isEcoFriendly(boolean testing)
	{
		if (testing)
			return true;
		else 
			return false;
	}
}
