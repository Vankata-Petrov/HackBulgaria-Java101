import java.util.Collection;
import java.util.Vector;

public class VectorN {
	private Vector<Double> v;
	
	VectorN(double[] coord) {
		for(int i = 0; i < coord.length; i++) {
			v.addElement(coord[i]);
		}
	}
	
	@SuppressWarnings("unchecked")
	VectorN(VectorN rhs) {
		this.v.addAll((Collection<? extends Double>) rhs);
	}
	
	public double getElementAt(int idx) {
		if (idx >= v.size()) {
			System.out.println("This index is out of bounds.");
			return 0;
		}
		
		return this.v.get(idx);
	}
	
	public void setElementAt(int idx, double val) {
		if (idx >= v.size())
			System.out.println("This index is out of bounds.");
		
		this.v.set(idx, val);
	}
	
	public int getDimensionality() {
		return this.v.size();
	}
	
	public double getLength() {
		double len = 0;
		for (int i = 0; i < this.v.size(); i++)
			len += Math.pow(this.getElementAt(i), 2);
		
		return Math.sqrt(len);
	}
	
	@Override
	public String toString() {
		return "(" + this.v.toString() + ")";
	}
	
	@Override
	public boolean equals(Object rhs) {
		if (this == rhs) return true;
		if (!(rhs instanceof VectorN)) return false;
		
		VectorN tmp = (VectorN) rhs;
		if (this.v.size() == tmp.v.size()) {
			for (int i = 0; i < this.v.size(); i++) {
				if (this.v.get(i) == tmp.v.get(i))
					continue;
				else
					return false;
			}
		
			return true;
		}
		else
			return false;
	}
	
	@Override
	public int hashCode() {
	    int hash = 17;
	    hash = hash * 23 + this.v.hashCode();
	    return hash;
	}
	
	public VectorN add(VectorN vector) {
		if(this.v.size() != vector.v.size()) {
			System.out.println("These vectors have different dimensions.");
			System.out.println("The operation cannot be completed.");
			return null;
		}
		else {
			for(int i = 0; i < this.v.size(); i++)
				this.v.set(i, this.v.get(i) + vector.v.get(i));
		}
		
		return this;
	}
	
	public VectorN subtract(VectorN vector) {
		if(this.v.size() != vector.v.size()) {
			System.out.println("These vectors have different dimensions.");
			System.out.println("The operation cannot be completed.");
			return null;
		}
		else {
			for(int i = 0; i < this.v.size(); i++)
				this.v.set(i, this.v.get(i) - vector.v.get(i));
		}
		
		return this;
	}
	
	public void add(float by) {
		for(int i = 0; i < this.v.size(); i++)
			this.v.set(i, this.v.get(i) + by);
	}
	
	public void subtract(float by) {
		for(int i = 0; i < this.v.size(); i++)
			this.v.set(i, this.v.get(i) - by);
	}
	
	public void multiply(float by) {
		for(int i = 0; i < this.v.size(); i++)
			this.v.set(i, this.v.get(i) * by);
	}
	
	public void divide(float by) {
		if (by == 0) 
			System.out.println("Can't divide by 0.");
		
		for(int i = 0; i < this.v.size(); i++)
			this.v.set(i, this.v.get(i) / by);
	}
	
	public double dotProduct(VectorN vector) {
		double sum = 0;
		
		if(this.v.size() != vector.v.size()) {
			System.out.println("These vectors have different dimensions.");
			System.out.println("The operation cannot be completed.");
			return 0;
		}
		else {
			for(int i = 0; i < this.v.size(); i++)
				sum += this.v.get(i) * vector.v.get(i);
		}
		
		return sum;
	}
	
}
