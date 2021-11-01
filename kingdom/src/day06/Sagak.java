package day06;

public class Sagak extends Shap {
	private int garo, sero;
	private double area;
	
	// 생성자
	public Sagak() {}
	public Sagak(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		getArea();
	}
	
	public double getArea() {
		area = garo * sero;
		return area;
	}

	public void toPrint() {
		System.out.println("사각형");
	}
}
