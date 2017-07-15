package template;

public class Coffee {

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

	private void pourInACup() {
		System.out.println(" Pouring into cup");
	}

	private void brewCoffee() {
		System.out.println(" Brewing coffee");
	}

	private void boilWater() {
		System.out.println(" Boling water");
	}

}
