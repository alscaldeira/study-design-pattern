package designpatterns.decorator;

public class Main {

	public static void main(String[] args) {
		Caramel caramel = new Caramel(new Expresso());
		System.out.println("Cost expresso = " + caramel.cost());

		Caramel caramel2 = new Caramel(new Decaf());
		System.out.println("Cost decaf = " + caramel2.cost());
	}

}
