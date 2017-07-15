package template;

public class Coffee extends Beverage {

	@Override
	public void prepareBeverage() {
		System.out.println(" Start");
		boilWater();
		brewCoffee();
		pourInACup();
		addMilkAndSugar();
		System.out.println(" Done");
	}

	private void addMilkAndSugar() {
		System.out.println(" Adding milk and sugar");
	}

	private void brewCoffee() {
		System.out.println(" Brewing coffee");
	}

}
