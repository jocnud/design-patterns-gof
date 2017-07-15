package template;

public abstract class Beverage {

	public abstract void prepareBeverage();

	public void boilWater() {
		System.out.println(" Boling water");
	}

	public void pourInACup() {
		System.out.println(" Pouring into cup");
	}
}
