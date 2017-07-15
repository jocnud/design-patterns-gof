package template;

public class LemonTea extends Beverage {

	@Override
	public void prepareBeverage() {
		System.out.println(" Start");
		boilWater();
		steepTea();
		pourInACup();
		addLemon();
		System.out.println(" Done");
	}

	private void steepTea() {
		System.out.println(" Steeping tea");
	}

	private void addLemon() {
		System.out.println(" Adding lemon");
	}
}
