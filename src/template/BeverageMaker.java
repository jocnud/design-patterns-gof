package template;

public class BeverageMaker {

	public static void main(String[] args) {

		Beverage coffee = new Coffee();
		coffee.prepareBeverage();

		System.out.println(" ---------- ");

		Beverage lemonTea = new LemonTea();
		lemonTea.prepareBeverage();

	}
}
