
final public class Ellipse implements Shape {
	final private double minor;
	final private double major;
	
	public Ellipse(double minor, double major) {
		if (minor == 0 || major == 0) {
			System.out.println("Points are on the origin.");
			this.minor = 0;
			this.major = 0;
		}
		
		else {
			this.minor = minor;
			this.major = major;
		}
	}
	
	public Ellipse(Ellipse r) {
		this.minor = r.minor;
		this.major = r.major;
	}
	
	final public double getMinor() {
		return this.minor;
	}
	
	final public double getMajor() {
		return this.major;
	}
	
	final public Point getUpperLeftV() {
		Point upperLeft = new Point(-major, minor);
		return upperLeft;
	}
	
	final public Point getLowerLeftV() {
		Point lowerLeft = new Point(-major, -minor);
		return lowerLeft;
	}
	
	final public Point getUpperRightV() {
		Point upperRight = new Point(major, -minor);
		return upperRight;
	}
	
	final public Point getLowerRightV() {
		Point lowerRight = new Point(major, -minor);
		return lowerRight;
	}
	
	final public Point getOrigin() {
		Point origin = new Point(0,0);
		return origin;
	}
	
	final public double getPerimeter() {
		 return Math.PI * 
				(3*(major + minor) - Math.sqrt((3*major + minor)*(major + 3*minor)));
	}
	
	final public double getArea() {
		return Math.PI * minor * major;
	}
	
	@Override
	public String toString() {
		return ("Ellipse[(" + this.minor + "," 
							+ this.major + "), "+ "(" 
							+ minor * 2 + ","
							+ major * 2 + ")]");
	}
	
	@Override
	public boolean equals(Object r) {
		if (this == r) return true;
		if (!(r instanceof Line)) return false;
		
		Ellipse e = (Ellipse) r;
		
		if (this.minor == e.minor && this.major == e.major)
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + Double.valueOf(minor).hashCode();
	    hash = hash * 23 + Double.valueOf(major).hashCode();
	    return hash;
	}
	
}
