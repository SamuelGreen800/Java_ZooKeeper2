public class Test {

	public static void main(String[] args) {
		
		Gorilla coco = new Gorilla(100);
		GargantuBat drakular = new GargantuBat(300);

		drakular.fly();
		drakular.eatHuman();
		drakular.razeTown();
		drakular.fly();
		drakular.eatHuman();
		drakular.razeTown();
		drakular.fly();
		drakular.displayEnergy();


		coco.throwPoop();
		coco.throwPoop();
		coco.throwPoop();
		
		coco.eatBanana();
		coco.eatBanana();
		
		coco.climbTree();
		System.out.println(coco.energy);
		
	}

}
