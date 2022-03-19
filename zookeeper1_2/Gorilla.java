public class Gorilla extends Mammal {

	public Gorilla(int energy) {
		super(energy);
	}
	public int throwPoop() {
		System.out.println("*Throws poop at the guests*");
		energy -= 5;
		return energy;
	}
	public int eatBanana() {
		System.out.println("*Eats a banana*");
		energy += 10;
		return energy;
	}
	public int climbTree() {
		System.out.println("*Climbs a tree*");
		energy -= 10;
		return energy;
	}
}