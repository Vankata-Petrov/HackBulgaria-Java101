
public class Triple<T, S, P> {
	private T first;
	private S second;
	private P third;
	
	public Triple() {
		first = null;
		second = null;
		third = null;
	}
	
	public Triple(T first, S second, P third) {
		this.setFirst(first);
		this.setSecond(second);
		this.setThird(third);
	}
	
	public void setFirst (T first) { 
		this.first = first; 
	}
	
	public void setSecond (S second) { 
		this.second = second; 
	}
	
	public void setThird (P third) {
		this.third = third;
	}
	
	public T getFirst() {
		return this.first;
	}
	
	public S getSecond() {
		return this.second;
	}
	
	public P getThird() {
		return this.third;
	}
}
