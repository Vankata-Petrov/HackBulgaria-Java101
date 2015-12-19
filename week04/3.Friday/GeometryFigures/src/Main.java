
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(0,0);
		Point p2 = new Point(-1,-2);
		Point p3 = new Point(20,31);
		
		Triangle tri = new Triangle(p1,p2,p3);
		System.out.println(tri.toString());
		
		Shape[] a = {new Circle(5), new Triangle(p1,p2,p3)};
	}

}
