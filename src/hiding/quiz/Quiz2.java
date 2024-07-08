package hiding.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setColor("흰색");
		car1.setManufacturor("현대");
		car1.setMaxSpeed(200);
		car1.setName("소나타");
		
		System.out.println(car1.getManufacturor()+","+car1.getName()+
				"," + car1.getMaxSpeed()+"," + car1.getColor());

	}

}

class Car {
	private String manufacturor;
	private String name;
	private String color;
	private int maxSpeed;
	public String getManufacturor() {
		return manufacturor;
	}
	public void setManufacturor(String manufacturor) {
		this.manufacturor = manufacturor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	
}


