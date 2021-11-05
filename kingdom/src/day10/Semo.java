package day10;

public class Semo implements Figure {
	private int width, height;
	private double area;
	
	public Semo() {
	}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setArea() {
		area = width * height / 2.0;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public double getArea() {
		return area;
	}

}
