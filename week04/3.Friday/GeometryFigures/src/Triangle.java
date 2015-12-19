
final public class Triangle implements Shape {
	final private Point a;
	final private Point b;
	final private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		Line p = new Line(a, b);
		Line q = new Line(b, c);
		Line r = new Line(a, c);
		
		if ((a.getX() == b.getX() || a.getX() == c.getX()) || 
			(a.getY() == b.getY() || a.getY() == c.getY())) {
				System.out.println("Points are on the same axis.");
				this.a = null;
				this.b = null;
				this.c = null;
		}
		
		else if (!((p.getLength() + q.getLength() > r.getLength()) && 
			(p.getLength() + r.getLength() > q.getLength()) && 
			(q.getLength() + r.getLength() > p.getLength()))) {
				System.out.println("The inequalities of the triangle are NOT true.");
				this.a = null;
				this.b = null;
				this.c = null;
		}
		
		else {
				this.a = a;
				this.b = b;
				this.c = c;
		}
		
	}
	
	public Triangle(Triangle r) {
		this.a = r.a;
		this.b = r.b;
		this.c = r.c;
	}
	
	final public Point getA() {
		return a;
	}
	
	final public Point getB() {
		return b;
	}
	
	final public Point getC() {
		return c;
	}
	
	final public Line getAB() {
		return new Line(this.getA(), this.getB());
	}
	
	final public Line getBC() {
		return new Line(this.getB(), this.getC());
	}
	
	final public Line getAC() {
		return new Line(this.getA(), this.getC());
	}
	
	final public double getBase() {
		return this.getAB().getLength();
	}
	
	final public double getHeight() {
		return (this.getArea() / this.getBase());
	}
	
	final public Point getCenter() {
		Point c = new Point(((this.a.getX() + this.b.getX() + this.c.getX()) / 3),
				            ((this.a.getY() + this.b.getY() + this.c.getY()) / 3));
		return c;
	}
	
	final public double getPerimeter() {
		return this.getAB().getLength() + this.getBC().getLength() + this.getAC().getLength();
	}
	
	final public double getArea() {
		double p = (this.getAB().getLength() 
				 +  this.getBC().getLength() 
				 +  this.getAC().getLength()) / 2;
		
		double area = Math.sqrt(p * (p - this.getAB().getLength()) 
				                  * (p - this.getBC().getLength())
				                  * (p - this.getAC().getLength()));
		
		return area;
	}
	
	@Override
	public String toString() {
		return ("Triangle[" + this.a.toString() + "," 
						    + this.b.toString() + "," 
						    + this.c.toString() + "), (" 
						    + this.getHeight()  + "," 
						    + this.getBase()    + ")]");
	}
	
	@Override
	public boolean equals(Object r) {
		if (this == r) return true;
		if (!(r instanceof Line)) return false;
		
		Triangle tri = (Triangle) r;
		
		if (this.getA() == tri.getA() && this.getB() == tri.getB() && this.getC() == tri.getC())
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + a.hashCode();
	    hash = hash * 23 + b.hashCode();
	    hash = hash * 23 + c.hashCode();
	    return hash;
	}
	
}
