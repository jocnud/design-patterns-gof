package template;

public class LemonTea {

	public void prepareBeverage() {
		System.out.println(" Start");
		boilWater();
		steepTea();
		pourInACup();
		addLemon();
		System.out.println(" Done");
	}

	private void boilWater() {
		System.out.println(" Boling water");
	}

	private void steepTea() {
		System.out.println(" Steeping tea");
	}

	private void pourInACup() {
		System.out.println(" Pouring into cup");
	}

	private void addLemon() {
		System.out.println(" Adding lemon");
	}
}
