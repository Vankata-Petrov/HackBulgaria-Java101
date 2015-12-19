
final public class Rectangle implements Shape {
	final private Point uLeft;
	final private Point lRight;
	
	public Rectangle(Point p1, Point p2) {
		if (p1.getX() == p2.getX() || p1.getY() == p2.getY()) {
			System.out.println("Points are on the same axis.");
			uLeft = new Point();
			lRight = new Point();
		}
		else {
			this.uLeft = p1;
			this.lRight = p2;
		}
	}
	
	public Rectangle(Rectangle r) {
		this.uLeft = r.uLeft;
		this.lRight = r.lRight;
	}
	
	final public Point getUpperLeft() {
		return this.uLeft;
	}
	
	final public Point getLowerLeft() {
		Point lLeft = new Point(uLeft.getX(), lRight.getY());
		return lLeft;
	}
	
	final public Point getUpperRight() {
		Point uRight = new Point(lRight.getX(), uLeft.getY());
		return uRight;
	}
	
	final public Point getLowerRight() {
		return this.lRight;
	}
	
	final public Line getLeftSide() {
		Line l = new Line(this.getUpperLeft(), this.getLowerLeft());
		return l;
	}
	
	final public Line getRightSide() {
		Line r = new Line(this.getUpperRight(), this.getLowerRight());
		return r;
	}

	final public Line getUpperSide() {
		Line u = new Line(this.getUpperLeft(), this.getUpperRight());
		return u;
	}

	final public Line getLowerSide() {
		Line d = new Line(this.getLowerLeft(), this.getLowerRight());
		return d;
	}
	
	final public double getHeight() {
		return this.getLeftSide().getLength();
	}
	
	final public double getWidth() {
		return this.getLowerSide().getLength();
	}
	
	final public Point getCenter() {
		Point center =
		new Point(((this.getUpperLeft().getY() - this.getLowerLeft().getY()) / 2),
				  ((this.getLowerLeft().getX() - this.getLowerRight().getX() / 2)));
		
		return center;
	}
	
	final public double getPerimeter() {
		return (2 * (this.getLeftSide().getLength() + this.getUpperSide().getLength()));
	}
	
	final public double getArea() {
		return (this.getLeftSide().getLength() * this.getLowerSide().getLength());
	}
	
	@Override
	public String toString() {
		return ("Rectangle[(" + this.uLeft.toString() + "," 
							  + this.lRight.toString() + "), "+ "(" 
							  + this.getHeight() + ","
							  + this.getWidth() + ")]");
	}
	
	@Override
	public boolean equals(Object r) {
		if (this == r) return true;
		if (!(r instanceof Line)) return false;
		
		Rectangle rect = (Rectangle) r;
		
		if (this.getUpperLeft() == rect.uLeft && this.getLowerRight() == rect.lRight)
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + uLeft.hashCode();
	    hash = hash * 23 + lRight.hashCode();
	    return hash;
	}

}
