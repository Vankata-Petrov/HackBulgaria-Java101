
final public class Point {
	final private double x;
	final private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(final Point r) {
		this.x = r.x;
		this.y = r.y;
	}
	
	public final double getX() {
		return this.x;
	}
	
	public final double getY() {
		return this.y;
	}
	
	public final static Point getOrigin() {
		Point origin = new Point();
		return origin;
	}
	
	@Override
	public String toString() {
		return ("Point(" + this.getX() + "," + this.getY() + ")");
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (! (o instanceof Point)) return false;
		
		Point p = (Point) o;
		
		if (this.getX() == p.getX() && this.getY() == p.getY())
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
	        int hash = 17;
	        hash = hash * 23 + Double.valueOf(this.x).hashCode();
	        hash = hash * 23 + Double.valueOf(this.y).hashCode();
	        return hash;
	}
	
	public static Line Add(Point point1, Point point2) {
		Line l = new Line(point1, point2);
		return l;
	}
	
}
