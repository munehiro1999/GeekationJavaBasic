package objectPractice;

public class Land extends Property {
	private double area;
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	
	public void printPropertyInfomation() {
		separator();
		displayPropertyInfomation();
		System.out.println("広さ：" + this.area + "㎡");
		separator();
	}
}
