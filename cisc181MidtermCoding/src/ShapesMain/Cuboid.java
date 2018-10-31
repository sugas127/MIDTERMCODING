package ShapesMain;
import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable{
	private int iDepth;
	public Cuboid(int iWidth, int iLength, int iDepth) {
		super(iWidth, iLength);
		this.iDepth = iDepth;
	}
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int a) {
		iDepth = a;
	}
	public double volume() {
		return getiWidth()*getiLength()*iDepth;
	}
	public double area() {
		double all = 2*(getiWidth()*getiLength())+2*(getiWidth()*iDepth)+2*(iDepth*getiLength());
		return all;
	}
	public double perimeter() {
		try {
			throw new UnsupportedOperationException();
		} catch(Exception e) {
			throw e;
		}
	}
	public int compareTo(Object o) {
		Cuboid o1 = (Cuboid) o;
		if ( ((Double)this.volume()).compareTo((Double)o1.volume()) != 0)
			return  ((Double)this.volume()).compareTo((Double)o1.volume());
		return ((Double)this.area()).compareTo((Double)o1.area());
	}
	public class SortByArea implements Comparator<Cuboid>{
		public SortByArea() {}
		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			return (int) (o1.area() - o2.area());
	}
}
	public class SortByVolume implements Comparator<Cuboid> {
		public SortByVolume() {}
		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			return (int) (o1.volume() - o2.volume());
	}	
}
}