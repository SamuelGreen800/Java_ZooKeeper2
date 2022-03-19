public class GargantuBat extends Mammal {

	public GargantuBat(int energy) {
		super(300);
	}

    public int fly() {
		System.out.println("*Whooosh, Whooosh !!Screams in  bat!! *");
		energy -= 50;
		return energy;
	}
	public int eatHuman() {
		System.out.println("*Crunch, crunch*");
		energy += 25;
		return energy;
	}
	public int razeTown() {
		System.out.println("*Women and children screaming in the distance*");
		energy -= 100;
		return energy;
	}
}