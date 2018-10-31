package ShapesMain;
import ShapesMain.Rectangle;

public class Rectangle extends Shape implements Comparable{
	private int iWidth;
	private int iLength;
	public Rectangle(int iWidth, int iLength) {
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	public int getiWidth() {
		return iWidth;
	}
	public void setiWidth(int a) {
		iWidth = a;
	}
	public int getiLength() {
		return iLength;
	}
	public void setiLength(int a) {
		iLength = a;
	}
	@Override
	public double area() {
		return iWidth*iLength;
	}
	@Override
	public double perimeter() {
		return 2*iWidth+2*iLength;
	}
	public String toString() {
		return iLength + " " + iWidth;
	}
	@Override
	public int compareTo(Object o) {
		Rectangle o1 = (Rectangle) o;
		if (((Double)this.area()).compareTo((Double)o1.area()) != 0)
			return ((Double)this.area()).compareTo((Double)o1.area());
		return ((Double)this.perimeter()).compareTo((Double)o1.perimeter());
	}
}