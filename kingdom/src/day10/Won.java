package day10;

import static java.lang.Math.*;
public class Won implements Figure {
	private int rad;
	private double arround, area;
	public Won() {
	}
	public Won(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArround() {
		return arround;
	}
	
	public void setArround() {
		arround = 2 * rad * PI;
	}

	public void setArround(double arround) {
		this.arround = arround;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad * rad * PI;
	}

	@Override
	public double getArea() {
		return area;
	}
	

}
