package template;

public abstract class Beverage {

	public final void prepareBeverage() {
		System.out.println(" Start");
		boilWater();
		brew();
		pourInACup();
		addCondiments();
		System.out.println(" Done");
	}

	public abstract void addCondiments();

	public abstract void brew();

	public void boilWater() {
		System.out.println(" Boling water");
	}

	public void pourInACup() {
		System.out.println(" Pouring into cup");
	}
}
