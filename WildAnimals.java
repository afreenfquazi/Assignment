package animalTypes;

public class WildAnimals {
	private String livin;
	private String foodType;
	
	public WildAnimals(String livin, String foodType) {
		super();
		this.livin = livin;
		this.foodType = foodType;
	}

	public void display() {
		System.out.println("WildAnimals [livin=" + livin + ", foodType=" + foodType + "]");
	}
	
	
}
