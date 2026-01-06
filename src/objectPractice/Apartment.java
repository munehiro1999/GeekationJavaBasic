package objectPractice;

public class Apartment extends Property {
	private int floorPlan;
	
	public void setFloorPlan(int floorPlan) {
		this.floorPlan = floorPlan;
	}
	
	public int getFloorPlan() {
		return floorPlan;
	}
	
	public void printPropertyInfomation() {
		separator();
		displayPropertyInfomation();
		System.out.println("間取り:" + this.floorPlan + "LDK");
		separator();
	}

}
