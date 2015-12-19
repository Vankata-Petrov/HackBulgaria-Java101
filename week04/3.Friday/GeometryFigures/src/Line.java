
@SuppressWarnings("rawtypes")
final public class Line implements Comparable {
	
	final private Point start;
	final private Point end;
	
	public Line(Point start, Point end) {
		if (start.equals(end)) {
			System.out.println("Cannot create a line segment with zero length");
			this.start = new Point();
			this.end = new Point();
		}
		else {
			this.start = start;
			this.end = end;
		}
	}
	
	public Line(Line r) {
		this.start = r.start;
		this.end = r.end;
	}
	
	final public Point getStart() {
		return this.start;
	}
	
	final public Point getEnd() {
		return this.end;
	}
	
	final public double getLength() {
		return Math.sqrt(Math.pow((this.end.getX() - this.start.getX()), 2) +
						 Math.pow((this.end.getY() - this.start.getY()), 2));
	}
	
	@Override
	public String toString() {
		return ("Line[(" + this.getStart().toString() + "," 
	                     + this.getEnd().toString() + ")]");
	}
	
	@Override
	public boolean equals(Object r) {
		if (this == r) return true;
		if (!(r instanceof Line)) return false;
		
		Line l = (Line) r;
		
		if (this.getStart() == l.start && this.getEnd() == l.end)
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + start.hashCode();
	    hash = hash * 23 + end.hashCode();
	    return hash;
	}

	@Override
	public int compareTo(Object o) {
		Line r = (Line) o;
		
		if (this.getLength() < r.getLength())
			return -1;
		else if (this.getLength() == r.getLength())
			return 0;
		else
			return 1;
	}
	
}
