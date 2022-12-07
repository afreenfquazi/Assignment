package animalTypes;

public class Main {
	public static void main(String[] args) {
		Deer dr = new Deer("Jungle","Vegan");
		dr.display();
		Lion l = new Lion("Zoo","Meatlover");
		l.display();
		Cat c = new Cat("House", "meow");
		c.display();
		Dog d = new Dog("House","Woof");
		d.display();
	}
}
