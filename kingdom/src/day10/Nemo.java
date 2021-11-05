package day10;

public class Nemo implements Figure {
	private int garo, sero, area;
	public Nemo() {
	}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}
	
	public void setArea() {
		area = garo * sero;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public double getArea() {
		return area;
	}

}
