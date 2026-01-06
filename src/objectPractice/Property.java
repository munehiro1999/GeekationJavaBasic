package objectPractice;

public class Property {
	private String propertyName;
	private String ownerName;
	private String propertyType;
	private int propertyValue;
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	
	public void setPropertyValue(int propertyValue) {
		this.propertyValue = propertyValue;
	}
	
	public String getPropertyName() {
		return propertyName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public String getPropertyType() {
		return propertyType;
	}
	
	public int getPropertyValue() {
		return propertyValue;
	}
	
	public void separator() {
		System.out.println("==========================");
	}
	
	public void displayPropertyInfomation() {
		System.out.println("物件名：" + this.propertyName);
		System.out.println("物件所有者名：山田" + this.ownerName);
		System.out.println("物件種別：" + this.propertyType);
		System.out.println("物件価格：" + this.propertyValue + "円");
	}
	
	public void printPropertyInfomation() {
		separator();
		displayPropertyInfomation();
		separator();
	}
}
