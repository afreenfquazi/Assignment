package animalTypes;

public class DomesticAnimals {
	private String livin;
	private String sound;
	public DomesticAnimals(String livin, String sound) {
		super();
		this.livin = livin;
		this.sound = sound;
	}
	public void display() {
		 System.out.println("DomesticAnimals [livin=" + livin + ", foodType=" + sound + "]");
	}
	
}
