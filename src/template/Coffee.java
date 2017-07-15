package template;

public class Coffee extends Beverage {

	@Override
	public void addCondiments() {
		System.out.println(" Adding milk and sugar");

	}

	@Override
	public void brew() {
		System.out.println(" Brewing coffee");

	}

}
