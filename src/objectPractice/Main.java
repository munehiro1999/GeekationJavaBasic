package objectPractice;

public class Main {
	public static void main(String[] args) {
		Apartment apartment = new Apartment();
		
		apartment.setPropertyName("いい感じのアパートメント");
		apartment.setOwnerName("マンション山田");
		apartment.setPropertyType("マンション");
		apartment.setPropertyValue(50000000);
		apartment.setFloorPlan(3);
		
		apartment.printPropertyInfomation();
		
		Land land = new Land();
		
		land.setPropertyName("いい感じの土地");
		land.setOwnerName("土地太郎");
		land.setPropertyType("土地");
		land.setPropertyValue(800000000);
		land.setArea(105.2);
		
		land.printPropertyInfomation();
		
		
		
		
	}
}