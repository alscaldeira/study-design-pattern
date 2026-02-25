package designpatterns.decorator;

public class Caramel extends AddonDecorator {

	Beverage beverage;
	
	public Caramel(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 0.50 + beverage.cost();
	}

}
