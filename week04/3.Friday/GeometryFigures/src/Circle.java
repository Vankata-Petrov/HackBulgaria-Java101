
final public class Circle implements Shape {
	final private double r;
	
	public Circle(double r) {
		if (r < 0)
			this.r = -r;
		else
			this.r = r;
	}
	
	public Circle(Circle rhs) {
		this.r = rhs.r;
	}
	
	final public double getR() {
		return this.r;
	}
	
	final public Point getUpperLeftV() {
		return new Point(-r, r);
	}
	
	final public Point getLowerLeftV() {
		return new Point(-r, -r);
	}

	final public Point getUpperRightV() {
		return new Point(r, r);
	}

	final public Point getLowerRightV() {
		return new Point(r, -r);
	}
	
	final public Point getCenter() {
		return new Point(0,0);
	}
	
	final public double getArea() {
		return Math.PI * this.r * this.r;
	}
	
	final public double getPerimeter() {
		return Math.PI * 2 * this.r;
	}
	
	@Override
	public String toString() {
		return ("Circle[(r = " + this.getR() + ")]");	
	}
	
	@Override
	public boolean equals(Object rhs) {
		if (this == rhs) return true;
		if (!(rhs instanceof Line)) return false;
		
		Circle c = (Circle) rhs;
		
		if (this.getR() == c.getR())
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + Double.valueOf(r).hashCode();
	    return hash;
	}
	
}
