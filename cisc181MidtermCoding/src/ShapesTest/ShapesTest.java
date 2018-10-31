package ShapesTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.*;

import org.junit.Test;

import ShapesMain.Cuboid;
import ShapesMain.Cuboid.SortByArea;
import ShapesMain.Cuboid.SortByVolume;
import ShapesMain.Rectangle;

public class ShapesTest {

	
	@Test
	public void Rectangle_Test1() {
		Rectangle r1 = new Rectangle(3, 4);
		assertTrue(r1 instanceof Rectangle);
	}
	
	@Test
	public void RectangleGetiLength_Test1() {
		Rectangle r1 = new Rectangle(3, 5);
		assertTrue(r1.getiLength() == 3);
	}
	
	@Test
	public void RectangleSetiLength_Test1() {
		Rectangle r1 = new Rectangle(4, 4);
		r1.setiLength(3);
		assertTrue(r1.getiLength() == 3);
	}
	
	@Test
	public void RectangleGetiWidth_Test1() {
		Rectangle r1 = new Rectangle(2, 5);
		assertTrue(r1.getiWidth() == 5);
	}
	
	@Test
	public void RectangleSetiWidth_Test1() {
		Rectangle r1 = new Rectangle(3, 4);
		r1.setiWidth(6);
		assertTrue(r1.getiWidth() == 6);
	}
	
	@Test
	public void RectangleArea_Test1() {
		Rectangle r1 = new Rectangle(5, 5);
		assertTrue(r1.area() == 25.0);
	}
	
	@Test
	public void RectanglePerimeter_Test1() {
		Rectangle r1 = new Rectangle(3, 5);
		assertTrue(r1.perimeter() == 16.0);
	}
	
	@Test
	public void RectangleCompareTo_Test1() {
		Rectangle r1 = new Rectangle(4, 8);
		Rectangle r2 = new Rectangle(2, 3);
		Rectangle r3 = new Rectangle(3, 4);
		ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		rList.add(r1);
		rList.add(r2);
		rList.add(r3);
		Collections.sort(rList);
		assertTrue(rList.get(0).area() == 6);
		assertTrue(rList.get(1).area() == 12);
		assertTrue(rList.get(2).area() == 32);
	}
	
	@Test
	public void CuboidTest() {
		Cuboid cube1 = new Cuboid(1, 2, 3);
		assertTrue(cube1 instanceof Cuboid);
	}
	
	@Test
	public void CuboidiLengthTest() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.getiLength() == 3);
	}
	
	@Test
	public void CuboidSetiLengthTest() {
		Cuboid cube1 = new Cuboid(6, 7, 8);
		cube1.setiLength(4);
		assertTrue(cube1.getiLength() == 4);
	}
	
	@Test
	public void CuboidGetiWidthTest() {
		Cuboid cube1 = new Cuboid(9, 10, 11);
		assertTrue(cube1.getiWidth() == 10);
	}
	
	@Test
	public void CuboidSetiWidthTest() {
		Cuboid cube1 = new Cuboid(12, 13, 14);
		cube1.setiWidth(14);
		assertTrue(cube1.getiWidth() == 14);
	}
	
	@Test
	public void CuboidGetiDepthTest() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.getiDepth() == 5);
	}
	
	@Test
	public void CuboidSetiDepthTest() {
		Cuboid cube1 = new Cuboid(1, 3, 5);
		cube1.setiDepth(6);
		assertTrue(cube1.getiDepth() == 6);
	}
	
	@Test
	public void CuboidAreaTest() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.area() == 94.0);
	}
	
	@Test
	public void CuboidPerimeterTest() {
		boolean thrownE = false;
		try {
			Cuboid cub1 = new Cuboid(3, 4, 5);
			cub1.perimeter();
		} catch(UnsupportedOperationException unsupportedOperationException) {
			thrownE = true;
		}
		assertTrue(thrownE);
	}
	
	@Test
	public void CuboidVolumeTest() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		assertTrue(cube1.volume() == 60.0);
	}
	
	@Test
	public void CuboidCompare1Test() {
		Cuboid cubeCompare = new Cuboid(0, 0, 0);
		Cuboid cube1 = new Cuboid(3, 4, 5);
		Cuboid cube2 = new Cuboid(4, 5, 6);
		Cuboid cube3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubeList1 = new ArrayList<Cuboid>();
		cubeList1.add(cube1);
		cubeList1.add(cube2);
		cubeList1.add(cube3);
		SortByArea sortByArea;
		
	}
	
	@Test
	public void CuboidCompare2Test() {
		Cuboid cube1 = new Cuboid(3, 4, 5);
		Cuboid cube2 = new Cuboid(4, 5, 6);
		Cuboid cube3 = new Cuboid(1, 3, 12);
		ArrayList<Cuboid> cubeList1 = new ArrayList<Cuboid>();
		cubeList1.add(cube1);
		cubeList1.add(cube2);
		cubeList1.add(cube3);
		Collections.sort(cubeList1);
		assertTrue(cubeList1.get(0).area() == 94.0);
		assertTrue(cubeList1.get(1).area() == 102.0);
		assertTrue(cubeList1.get(2).area() == 148.0);

	}

}