
public class GenericBackpack<T> {
	private T obj;
	
	public GenericBackpack()
	{
		obj = null;
	}
	
	public GenericBackpack(T o)
	{
		this.setObj(o);
	}
	
	public void setObj (T o)
	{
		this.obj = o;
	}
	
	public T getObj()
	{
		return this.obj;
	}

}
