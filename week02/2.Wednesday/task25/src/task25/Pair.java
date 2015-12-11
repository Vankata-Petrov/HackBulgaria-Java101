package task25;

public class Pair {

	private Object obj1;
	private Object obj2;
	
	public Pair()
	{
		obj1 = null;
		obj2 = null;
	}
	
	public Pair(Object obj1, Object obj2)
	{
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	private final Object getObj1()
	{
		return this.obj1;
	}
	
	private final Object getObj2()
	{
		return this.obj2;
	}
	
	public String toString()
	{
		return "(" + this.obj1 + "," + this.obj2 + ")";
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (!(o instanceof Pair)) return false;

		
		Pair pair = (Pair) o;
		
		if (getObj1().equals(pair.obj1) && getObj2().equals(pair.obj2))
			return true;
		else
			return false;
	}
	
	@Override
    public int hashCode() {
        int result = obj1 != null ? obj1.hashCode() : 0;
        result = 31 * result + (obj2 != null ? obj2.hashCode() : 0);
        return result;
    }
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair first = new Pair(3,5);
		Pair second = new Pair("ivan",5);
		Pair third = new Pair("ivan", 5);
		System.out.println(first.toString());
		System.out.println(third.equals(second));
	}

}
