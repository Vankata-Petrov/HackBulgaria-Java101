
public class Pair<T, S> {
	private T obj1;
	private S obj2;
	
	public Pair()
	{
		this.obj1 = null;
		this.obj2 = null;
	}
	
	public Pair(T first, S second)
	{
		this.setObj1(first);
		this.setObj2(second);
	}
	
	public void setObj1 (T o)
	{
		this.obj1 = o;
	}
	
	public void setObj2 (S o)
	{
		this.obj2 = o;
	}
	
	public T getObj1()
	{
		return this.obj1;
	}
	
	public S getObj2()
	{
		return this.obj2;
	}
	
	@Override
	public boolean equals (Object obj)
	{
		if (this == obj) return true;
		if (!(obj instanceof Pair)) return false;
		
		Pair<T, S> pair = (Pair<T, S>) obj;
		
		if ( this.getObj1().equals(pair.getObj1()) &&
		     this.getObj2().equals(pair.getObj2()))
				return true;
		else
				return false;
	}
	
	@Override
	public int hashCode ()
	{
		int result = obj1 != null ? obj1.hashCode() : 0;
        result = 31 * result + (obj2 != null ? obj2.hashCode() : 0);
        return result;
	}	
}
