package template;

public class BeverageMaker {

	public static void main(String[] args) {

		Coffee coffee = new Coffee();
		coffee.prepareBeverage();

		System.out.println(" ---------- ");

		LemonTea lemonTea = new LemonTea();
		lemonTea.prepareBeverage();

	}
}
